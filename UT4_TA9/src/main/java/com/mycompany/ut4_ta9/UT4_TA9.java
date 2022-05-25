package com.mycompany.ut4_ta9;

import com.mycompany.tda.IArbolProducto;
import com.mycompany.tda.TArbolProducto;
import com.mycompany.tda.TArbolBB;
import com.mycompany.tda.IArbolBB;
import com.mycompany.tda.IElementoAB;
import com.mycompany.tda.TElementoAB;
import com.mycompany.util.ManejadorArchivosGenerico;


public class UT4_TA9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        IAlmacen almacen_0 = new Almacen("Almacen_0"); //Se instancia un almacen, este ya crea un arbol.
        TArbolProducto arbolProducto = new TArbolProducto(); //El prograna esta funcionando sin esta clase, se esta probando en paralelo otra metodologia.
        //-----------------------------------------------------------------------------------------------------------------------------
        // cargar los productos desde el archivo "altasprueba.txt"
        String nombreArchivo = "altasPrueba.txt";
        String[] datosProducto;
        try {
            String[] altasPrueba = ManejadorArchivosGenerico.leerArchivo(nombreArchivo);
            System.out.println("Se leyeron un total  de : " + altasPrueba.length + " linea/s de ALTAS. \n");
                      
            for (String linea : altasPrueba){
                datosProducto = linea.split(",");
                IProducto producto = new Producto(Integer.parseInt(datosProducto[0]),datosProducto[1]); //Se van creando los Productos.
                producto.setPrecio(Integer.parseInt(datosProducto[2]));
                producto.setStock(Integer.parseInt(datosProducto[3]));

                almacen_0.insertarProducto((Producto)producto); //Se agrega el producto al almacen.
            
                IElementoAB<Producto> elementoAB = new TElementoAB<>(producto.getEtiqueta(),(Producto)producto); //Probando otro metodo de hacerse lo mismo
                arbolProducto.insertar(elementoAB);
            }
        }
        catch(Exception read) {
            System.out.println("ERROR AL LEER "+nombreArchivo);
        }
        System.out.println("\n"); 
        
        //-----------------------------------------------------------------------------------------------------------------------------
        // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println("Listado ETIQUETA/PRODUCTO/CANTIDAD :\n" + almacen_0.listarProductos()+ "\n"); //Primero se recorre el arbol, se arma una lista y luego se recorre la lista.
        System.out.println("Listado ETIQUETA/PRODUCTO/CANTIDAD :\n" + arbolProducto.etiquetaNombreCantidad() + "\n");//Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        //-----------------------------------------------------------------------------------------------------------------------------

        //emitir el valor del stock
        System.out.println("VALOR TOTAL ALMACEN : "+ almacen_0.getValorStockAlmacen()); // Valor total del almacen.
        System.out.println("STOCK TOTAL ALMACEN : "+ almacen_0.getStockAlmacen()); // Stock total del almacen.
     
        int[] stockYvalorTotal = arbolProducto.cantidadYvalorStock(); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        System.out.println("STOCK TOTAL ALMACEN : " + stockYvalorTotal[0]); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        System.out.println("VALOR TOTAL ALMACEN : " + stockYvalorTotal[1] + "\n"); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        //-----------------------------------------------------------------------------------------------------------------------------
        // simular las ventas a partir del archivo "ventaspruebas.txt"
        nombreArchivo = "ventasPrueba.txt";
        
        try{
            String[] ventasPrueba = ManejadorArchivosGenerico.leerArchivo(nombreArchivo);
            System.out.println("Se leyeron un total  de : " + ventasPrueba.length + " linea/s de VENTA. \n");
       
            for (String linea : ventasPrueba){
                datosProducto = linea.split(",");
                almacen_0.restarStock(Integer.parseInt(datosProducto[0]),Integer.parseInt(datosProducto[1])); //restarStock controla si existe el producto en el almacen
            
                IElementoAB<Producto> elementoArbolProducto = arbolProducto.buscar(Integer.parseInt(datosProducto[0])); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
                if (elementoArbolProducto != null){
                    System.out.println("**********El producto "+elementoArbolProducto.getEtiqueta()+"/"+elementoArbolProducto.getDatos().getStock()+" de arbolProducto antes de modificar*******");
                    if(elementoArbolProducto.getDatos().restarStock(Integer.parseInt(datosProducto[1])) >= 0){
                        System.out.println("VENTA PROCESADA PARA EL SEGUNDO METODO DE HACER EL TRABAJO.");
                    }else{
                        System.out.println("VENTA NO PROCESADA EL STOCK VENDIDO SUPERA AL DEL ALMACENADO.");
                    }
                    System.out.println("**********El producto "+elementoArbolProducto.getEtiqueta()+"/"+elementoArbolProducto.getDatos().getStock()+" de arbolProducto luego de modificar*******");
                }
            }
        }catch(Exception read){
            System.out.println("ERROR AL LEER "+nombreArchivo);
        }
        
        //-----------------------------------------------------------------------------------------------------------------------------

        System.out.println("VALOR TOTAL ALMACEN : " + almacen_0.getValorStockAlmacen());
        System.out.println("STOCK TOTAL ALMACEN : " + almacen_0.getStockAlmacen());
        stockYvalorTotal = arbolProducto.cantidadYvalorStock();
        System.out.println("STOCK TOTAL ALMACEN : " + stockYvalorTotal[0]); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        System.out.println("VALOR TOTAL ALMACEN : " + stockYvalorTotal[1] + "\n"); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
       
        //-----------------------------------------------------------------------------------------------------------------------------
        // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
        nombreArchivo = "elimPrueba.txt";
        try{
            String[] elimPrueba = ManejadorArchivosGenerico.leerArchivo(nombreArchivo);
            System.out.println("Se leyeron un total  de : " + elimPrueba.length + " linea/s de ALTAS. \n");
        
            for (String linea : elimPrueba){
                datosProducto = linea.split(",");
                almacen_0.eliminarProducto(Integer.parseInt(datosProducto[0]));
            }
        }catch(Exception read){
            System.out.println("ERROR AL LEER "+nombreArchivo);
        }
        
        //-----------------------------------------------------------------------------------------------------------------------------

        // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println("Listado ETIQUETA/PRODUCTO/CANTIDAD :\n" + almacen_0.listarProductos());
        stockYvalorTotal = arbolProducto.cantidadYvalorStock();
        System.out.println("STOCK TOTAL ALMACEN : " + stockYvalorTotal[0]); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        System.out.println("VALOR TOTAL ALMACEN : " + stockYvalorTotal[1] + "\n"); //Probando otro metodo de hacerse lo mismo, en este caso se emite informacion adicional.
        System.out.println("Listado ETIQUETA/PRODUCTO/CANTIDAD :\n" + arbolProducto.etiquetaNombreCantidad() + "\n");
        ManejadorArchivosGenerico.escribirArchivo("TodosLosProductosDelAlmacen.txt",almacen_0.listarProductos());
        
    }
}
