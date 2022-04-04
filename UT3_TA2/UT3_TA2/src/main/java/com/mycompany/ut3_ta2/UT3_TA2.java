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
        
        //Almacen almacen01 = new Almacen();
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        
        String[] listaProductos = manejador.leerArchivo("altasPrueba.txt");
        System.out.println(listaProductos[0]);
        
        
        //for (int i = 0; i < listaProductos.length; i++) {
            //System.out.println(listaProductos[i]);
            //Producto producto = new Producto(listaProductos[i]);
        //}
        
    }
}
