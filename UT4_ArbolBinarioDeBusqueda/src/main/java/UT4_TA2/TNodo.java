package UT4_TA2;

public class TNodo<T> {
    Comparable etiqueta;
    TNodo siguiente;
    Object dato;
    
    public <T> TNodo (Comparable etiqueta,Object nodo){
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
