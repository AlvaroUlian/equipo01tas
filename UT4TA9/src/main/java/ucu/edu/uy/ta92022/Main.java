package ucu.edu.uy.ta92022;

import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolBB arbol = new TArbolBB();
        IAlmacen almacen = new Almacen("nombre");
      // cargar los productos desde el archivo "altasprueba.txt"
      String[] archivo = ManejadorArchivosGenerico.leerArchivo("claves1.txt");
        
        for (String linea : archivo) {
            String[] auxLinea = linea.split(",");
            Producto prod = new Producto(Integer.parseInt(auxLinea[0]), auxLinea[1]);
            
            prod.setPrecio(Integer. parseInt(auxLinea[2]));
            prod.setStock(Integer. parseInt(auxLinea[3]));
            arbol.insertar(new TElementoAB(Integer.parseInt(auxLinea[0]), prod));
        }
      // listar los productos ordenados por codigo, junto con su cantidad existente
      //emitir el valor del stock
      // simular las ventas a partir del archivo "ventaspruebas.txt"
      
      // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
      // listar los productos ordenados por codigo, junto con su cantidad existente

    }
}

