/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT3_TA1;

/**
 *
 * @author anavalin
 */
public class Program {
    
    public static void main(String[] args) {
        Object numero = new Object();
         TNodo nodo1 = new TNodo(1, numero);
         TNodo nodo2 = new TNodo(2, numero);
         TNodo nodo3 = new TNodo(3, numero);
         TNodo nodo4 = new TNodo(4, numero);
         
         TLista lista = new TLista();
         lista.insertarOrdenado(nodo3.getEtiqueta(), numero);
         lista.insertarOrdenado(nodo4.getEtiqueta(), numero);
         
         TNodo num = lista.getPrimero();
         System.out.println(num.getEtiqueta());
    }
    
}
