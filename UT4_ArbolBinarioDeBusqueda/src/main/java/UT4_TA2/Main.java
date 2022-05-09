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
    
    public static void main(String[] args)
    {
        TArbolBB arbol1 = new TArbolBB();
        
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("claves1.txt");
        
        for (String linea : archivo) {
            arbol1.insertar(new TElementoArbolBB<String>(Integer.parseInt(linea)));
        }
        
        
        System.out.println(arbol1.inOrden());
        
    
    }
    
    
}
