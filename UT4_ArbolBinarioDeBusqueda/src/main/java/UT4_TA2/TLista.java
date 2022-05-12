/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA2;
/**
 *
 * @author anavalin
 */
public class TLista<T> {
    TNodo primero;
    
   public TLista(){
        this.primero = null;
    }
    
    public boolean esVacia(){return primero == null;}
    
    public void insertarDelante(Comparable etiqueta,Object objeto){
        
        TNodo nuevoNodo = new TNodo(etiqueta, objeto);
        if (this.primero!= null){
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
        else{primero = nuevoNodo;}
        
    }
    public void insertar(Comparable etiqueta, Object objeto){
        TNodo nodo = new TNodo(etiqueta, objeto);
        
        if(esVacia()){primero = nodo;}
        else{
            TNodo actual = primero;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
                nodo = actual.getSiguiente();
            }
        }
    }
    
    public TNodo buscar(Comparable etiqueta){
        if(esVacia()){return null;}
        else{
            TNodo actual = primero;
            while(actual.getSiguiente() != null){
                if(actual.getEtiqueta() == etiqueta){
                actual = actual.getSiguiente();
                return actual;}
            }
            return null;
        }
    }
    
    public void insertarOrdenado(Comparable etiqueta, Object objeto){
        TNodo nodo = new TNodo(etiqueta, objeto);
        
        if(esVacia()){
            primero = nodo;
        }else{
             TNodo actual = primero;
             if((int) nodo.getEtiqueta() < (int) actual.getEtiqueta()){
                 actual = actual.getSiguiente();
                 this.primero = nodo;
             }
             while(actual != null){
                 if ((int) nodo.getEtiqueta() < (int) actual.getEtiqueta()) {
                     actual = nodo.getSiguiente();
                 }
                 actual = actual.getSiguiente();
             }
             nodo = actual.getSiguiente();
        }
        
    }
    
   public TNodo getPrimero(){return this.primero;}
    
    
}
