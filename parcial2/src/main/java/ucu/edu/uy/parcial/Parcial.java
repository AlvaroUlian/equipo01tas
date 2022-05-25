package ucu.edu.uy.parcial;

import ucu.edu.uy.parcial.entidades.Pieza;
import ucu.edu.uy.parcial.entidades.StockTotal;
import ucu.edu.uy.parcial.entidades.TArbolDeposito;
import ucu.edu.uy.parcial.entidades.TElementoArbolDeposito;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

public class Parcial
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        //======PARTE 1==========
        // Cargar el depósito con Piezas a partir del archivo piezas.txt
        // Recuerde validar cada líena.
        TArbolDeposito<Pieza> deposito = new TArbolDeposito<>();
        
        String nombreArchivo = "piezas.txt";
        String[] datosPieza;
        try {
            String[] altasPiezas = ManejadorArchivosGenerico.leerArchivo(nombreArchivo);
            System.out.println("Se leyeron un total  de : " + altasPiezas.length + " linea/s de ALTAS. \n");
                      
            for (String linea : altasPiezas){
                datosPieza = linea.split(",");
                Pieza pieza = new Pieza(datosPieza[0], datosPieza[1], datosPieza[2], Integer.parseInt(datosPieza[3]), Integer.parseInt(datosPieza[4]));
                
                deposito.insertar(new TElementoArbolDeposito<>(pieza.getCodigo(),pieza)); //Se insertan los nodos pieza al arbol
            }
        }
        catch(Exception leer) {
            System.out.println("ERROR AL LEER "+nombreArchivo);
        }
        System.out.println("\n"); 

        

        //======PARTE 2==========
        // Realizar la llamada al método cantYvalorStock y emitir por consola
        // la cantidad de piezas y el valor de stock total.
        StockTotal stockTotal = deposito.cantYvalorStock();
        System.out.println("Cantidad piezas total en stok: "+ stockTotal.getCantidadPiezas());
        System.out.println("Cantidad valor total del stok: "+ stockTotal.getValorStok());

        //======PARTE 3==========
        // Obtener el árbol de piezas por rubros llamando al método piezasPorRubro
        // con el rubro que se designe en clase.
        // Emitir un archivo de llamado porrubro.txt el cual contenga todos
        // los datos de las piezas de dicho rubro ordenado por descripción.
        String rubro = "9"; // ESTE RUBRO SE DESIGNARÁ EN LA CLASE
        IArbolBB<Pieza> arbolPieza = deposito.piezasPorRubro(rubro);
        ILista<Pieza> listaPieza = arbolPieza.inOrden();
        INodo<Pieza> nodoListaPieza = listaPieza.getPrimero();
        
        String[] listaPiezas = new String[listaPieza.cantElementos()];
        int index = 0;
        while (nodoListaPieza != null){
          listaPiezas[index] = nodoListaPieza.getDato().getCodCatalogo() +","+ nodoListaPieza.getDato().getCodigo() +","+ nodoListaPieza.getDato().getDescripcion() +","+ nodoListaPieza.getDato().getCantidad() +","+ nodoListaPieza.getDato().getPrecioUnitario();
                  nodoListaPieza = nodoListaPieza.getSiguiente();
                  index+=1;
        }
        ManejadorArchivosGenerico.escribirArchivo("TodosLosProductosDelAlmacen.txt",listaPiezas);
        
    }

}
