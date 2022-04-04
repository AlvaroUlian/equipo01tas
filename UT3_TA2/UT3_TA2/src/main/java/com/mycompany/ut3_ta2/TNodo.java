/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta2;
/**
 *
 * @author anavalin
 */
public class TNodo {
    Comparable etiqueta;
    TNodo siguiente;
    Object nodo;
    
    public TNodo (Comparable etiqueta,Object nodo){
        this.etiqueta = etiqueta;
        this.nodo = nodo;
    }
    
    public TNodo getSiguiente(){
        
     return this.siguiente;
    }
    
    public void setSiguiente(TNodo nodo){
        
      this.siguiente = nodo;
    }
    
    public Comparable getEtiqueta(){return this.etiqueta;}
    
    public Object getDato(){
        return nodo;
    }
    
}
