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
        
        
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        
        String[] listaProductos = manejador.leerArchivo("altasPrueba.txt");
        
        //LISTA DE TODOS LOS PRODUCTOS
        TLista productosTotales = new TLista();
        
        //ALTA DE PRODUCTOS
        for (int i = 0; i < listaProductos.length; i++) {
            String[] linea = listaProductos[i].split(",");
            Producto producto = new Producto(Float.parseFloat(linea[2]), linea[1], linea[0], Integer. parseInt(linea[3]));
            productosTotales.insertarOrdenado(linea[0], producto);
        }
        
        //ALMACEN
        Almacen almacen01 = new Almacen(productosTotales, "G.E.AN.T");
        
    }
}
