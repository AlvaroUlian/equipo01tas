/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_ta2;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class UT3_TA2 {

    public static void main(String[] args) {
        
        String[] altas = ManejadorArchivosGenerico.leerArchivo("altasPrueba.txt");
        String[] ventas = ManejadorArchivosGenerico.leerArchivo("altasPrueba.txt");
        
        
        //LISTA DE TODOS LOS PRODUCTOS
        TLista productosTotales = new TLista();
        
        //ALTA DE PRODUCTOS
        //for (int i = 0; i < listaProductos.length; i++) {
        //    String[] linea = listaProductos[i].split(",");
        //    Producto producto = new Producto(Float.parseFloat(linea[2]), linea[1], linea[0], Integer. parseInt(linea[3]));
        //    productosTotales.insertarOrdenado(linea[0], producto);
        //}
        
        //ALMACEN
        Almacen almacen01 = new Almacen(productosTotales, "G.E.AN.T");
        
        //Venta de producto
        // Se asume que producto ya está insertado en el almacén
        for (int i = 0; i < ventas.length; i++) {
            var lineaActual = ventas[i].split(",");
            Producto productoActual = almacen01.buscarProductoPorCodigo(lineaActual[0]);
            int stockViejo = productoActual.stock;
            almacen01.reducirStock(Integer.parseInt(lineaActual[1]), lineaActual[0]);
            int stockActual = productoActual.stock;
            System.out.println("Stock Anterior: " + stockViejo + "Stock Actual: " + stockActual);
        }
        
    }
}
