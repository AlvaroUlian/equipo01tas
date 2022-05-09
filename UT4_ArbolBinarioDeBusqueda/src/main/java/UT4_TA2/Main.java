/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA2;

/**
 *
 * @author anavalin
 */
public class Main {
    
    TArbolBB arbol1 = new TArbolBB();
    
    String[] archivo = ManejadorArchivosGenerico.leerArchivo("clave1.txt");
    
    for (int i = 0; i < archivo.length; i++){
        String[] linea = archivo[i].split(",");
            
        TElementoArbolBB elemento = new TElementoArbolBB(Integer.parseInt(linea[0]));
        arbol1.insertar(elemento);
    }
    
}
