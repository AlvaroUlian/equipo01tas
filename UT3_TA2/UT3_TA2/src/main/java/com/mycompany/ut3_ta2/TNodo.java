package com.mycompany.ut3_ta2;

public class TNodo {
    Comparable etiqueta;
    TNodo siguiente;
    Object dato;
    
    public TNodo (Comparable etiqueta,Object nodo){
        this.etiqueta = etiqueta;
        this.dato = nodo;
    }
    public TNodo getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(TNodo nodo){
        this.siguiente = nodo;
    }
    public Comparable getEtiqueta(){
        return this.etiqueta;
    }
    public Object getDato(){
        return dato;
    }
}
