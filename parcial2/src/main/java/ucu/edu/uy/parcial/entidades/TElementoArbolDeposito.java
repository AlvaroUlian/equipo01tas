/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial.entidades;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author nnavarro
 * @param <T>
 */
public class TElementoArbolDeposito<T extends Pieza> extends TElementoAB<T> implements IElementoArbolDeposito<T>
{

    public TElementoArbolDeposito(Comparable unaEtiqueta, T unosDatos)
    {
        super(unaEtiqueta, unosDatos);
    }

    @Override
    public TElementoArbolDeposito getHijoIzq()
    {
        return (TElementoArbolDeposito) super.getHijoIzq();
    }

    @Override
    public TElementoArbolDeposito getHijoDer()
    {
        return (TElementoArbolDeposito) super.getHijoDer();
    }

    @Override
    public void cantYvalorStock(StockTotal stockTotal)
    {
        
        stockTotal.setCantidadPiezas(this.getDatos().getCantidad()+stockTotal.getCantidadPiezas()); //CANTIDAD PIEZA + CANTIDAD DEPOSITO
        stockTotal.setValorStok((this.getDatos().getCantidad()*this.getDatos().getPrecioUnitario())+stockTotal.getValorStok());//CANTIDAD PIEZA*PRECIO + PRECIO DEPOSITO
        
        if (this.getHijoIzq() != null)
        {
            this.getHijoIzq().cantYvalorStock(stockTotal);
        }
        if (this.getHijoDer() != null)
        {
            this.getHijoDer().cantYvalorStock(stockTotal);
        }
        
    }

    @Override
    public void piezasPorRubro(String unRubro, IArbolBB<Pieza> arbolPiezas)
    {
        String[] rubro = this.getDatos().getCodCatalogo().split("\\.");
        if (rubro[0].equals(unRubro))
        {
            arbolPiezas.insertar(new TElementoAB<Pieza> (this.getDatos().getCodCatalogo(),this.getDatos()));
        }
        
        if (this.getHijoIzq() != null)
        {
            this.getHijoIzq().piezasPorRubro(unRubro,arbolPiezas);
        }
        if (this.getHijoDer() != null)
        {
            this.getHijoDer().piezasPorRubro(unRubro,arbolPiezas);
        }
    }

    

}
