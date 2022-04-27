/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut3_ta7;

/**
 *
 * @author facum
 */
public class UT3_TA7 {

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        conjunto.insertar(new Nodo('1',"dato"));
                
        Conjunto conjunto_ = new Conjunto();
        conjunto_.insertar(new Nodo('2',"dato"));
                
        Conjunto conjuntoUnion = conjunto.union(conjunto_);
        System.out.println("Impresión por pantalla de los datos de cada elemento de la lista...");
        conjuntoUnion.imprimir();
        Conjunto conjuntoInterseccion = conjunto.interseccion(conjunto);
        System.out.println("Impresión por pantalla de los datos de cada elemento de la lista...");
        conjuntoInterseccion.imprimir();
    }
}
