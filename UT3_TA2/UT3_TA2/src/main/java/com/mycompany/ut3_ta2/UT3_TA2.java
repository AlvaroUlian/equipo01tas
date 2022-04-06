/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_ta2;


/**
 *
 * @author Administrador
 */
public class UT3_TA2 {

    public static void main(String[] args) {
        
        //LISTA DE TODOS LOS PRODUCTOS
        TLista productosTotales = new TLista();
        //ALMACEN
        Almacen almacen01 = new Almacen(productosTotales, "G.E.AN.T");
        
        
        //ALTA DE PRODUCTOS
        String[] altas = ManejadorArchivosGenerico.leerArchivo("altasPrueba.txt");
        for (int i = 0; i < altas.length; i++) {
            String[] linea = altas[i].split(",");
            Producto productoActual = almacen01.buscarProductoPorCodigo(linea[0]);
            if (productoActual == null){
                Producto producto = new Producto(Float.parseFloat(linea[2]), linea[1], linea[0], Integer. parseInt(linea[3]));
                almacen01.agregarProducto(producto);
                System.out.println("Se agregó el producto.");
            }
            else{almacen01.agregarStock(Integer. parseInt(linea[3]), linea[0]);
            System.out.println("Al producto que ya existe se les modificó el stock.");
            }
        }
        
        
        //VENTA DE PRODUCTOS
        // Se asume que producto ya está insertado en el almacén
        String[] ventas = ManejadorArchivosGenerico.leerArchivo("ventasPrueba.txt");
        for (int i = 0; i < ventas.length; i++) {
            var lineaActual = ventas[i].split(",");
            Producto productoActual = almacen01.buscarProductoPorCodigo(lineaActual[0]);
            if (productoActual != null){  //Se controla que el almacen encuentre el producto vendido
              int stockViejo = productoActual.stock;
              almacen01.reducirStock(Integer.parseInt(lineaActual[1]), lineaActual[0]);
              int stockActual = productoActual.stock;
              System.out.println("Stock Anterior: " + stockViejo + " / Stock Actual: " + stockActual);  
            }
            
        }
       
    }
}
