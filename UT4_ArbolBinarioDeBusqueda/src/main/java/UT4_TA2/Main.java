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
            //arbol1.insertar(new TElementoArbolBB<String>(Integer.parseInt(linea)));
        }
        
        
        System.out.println("Inorder: " + arbol1.inOrden());
        System.out.println("Postorder: " + arbol1.postOrden());
        System.out.println("Preorder: " + arbol1.preOrden());
        
        System.out.println("Altura: " + arbol1.altura());
        System.out.println("Tamaño: " + arbol1.tamaño());
        System.out.println("Cant Hojas: " + arbol1.contarHojas());
        
        System.out.println("Nivel de valor 11988: " + arbol1.nivelNodoABB(11988));
        //-1 al nivel 
    
    }
    
    
}
