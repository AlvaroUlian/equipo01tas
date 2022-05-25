/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial.entidades;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.TArbolBB;

/**
 *
 * @author nnavarro
 * @param <T>
 */
public class TArbolDeposito<T extends Pieza> extends TArbolBB<T> implements IArbolDeposito
{

    public TElementoArbolDeposito<Pieza> getRaizArbolDeposito()
    {
        this.getRaiz();
        return (TElementoArbolDeposito<Pieza>) super.getRaiz();
    }

    @Override
    public StockTotal cantYvalorStock()
    {
        StockTotal stockTotal = new StockTotal();
        TElementoArbolDeposito<Pieza> nodoPieza = this.getRaizArbolDeposito();
        if (nodoPieza!=null){
            nodoPieza.cantYvalorStock(stockTotal);
        }
        return stockTotal;
        
        /**
        Nodo<T> nodoPieza = this.inOrden().getPrimero();
        
        int[] cantYvalor = new int[2];
        StockTotal stockTotal = new StockTotal();
        while (nodoPieza != null) {
            cantYvalor[0] += nodoPieza.getDato().getCantidad();
            cantYvalor[1] += (nodoPieza.getDato().getPrecioUnitario()* nodoPieza.getDato().getCantidad());
            nodoPieza = nodoPieza.getSiguiente();
        }
        stockTotal.setCantidadPiezas(cantYvalor[0]);
        stockTotal.setCantidadPiezas(cantYvalor[1]);
                
        return stockTotal;
        */
    }

    @Override
    public IArbolBB<Pieza> piezasPorRubro(String unRubro)
    {
        IArbolBB<Pieza> arbolBBpieza = new TArbolBB<>();
        TElementoArbolDeposito<Pieza> nodoPieza = this.getRaizArbolDeposito();
        if (nodoPieza!=null){
            nodoPieza.piezasPorRubro(unRubro, arbolBBpieza);
        }
        return arbolBBpieza;
        
        /**
        TArbolDeposito arbol;
        Nodo<T> actual;
        Lista<T> lista;
        Pieza pieza;

        arbol = new TArbolDeposito();

        if (this.getRaiz() == null) {
            return arbol;
        }

        lista = this.inOrden();
        actual = lista.getPrimero();
        while (actual != null) {
            pieza = actual.getDato();

            if (pieza.getDescripcion().equals(unRubro)) {
                arbol.insertar(new TElementoAB<>(pieza.getCodigo(), pieza));
            }
            actual = actual.getSiguiente();
        }
        return arbol;
        */ 
    }
    
}
