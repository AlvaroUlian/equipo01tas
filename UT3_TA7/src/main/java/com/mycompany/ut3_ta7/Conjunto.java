/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta7;

/**
 *
 * @author facum
 */
public class Conjunto extends Lista {
    
    public Conjunto union(Conjunto conjunto){
        Conjunto nuevoConjunto = new Conjunto();
        Nodo aux = this.getPrimero();
        while (aux != null){
            nuevoConjunto.insertar(new Nodo(aux.getEtiqueta(),aux.getDato()));
            aux = aux.getSiguiente();
        }
        aux = conjunto.getPrimero();
        while (aux != null){
            nuevoConjunto.insertar(new Nodo(aux.getEtiqueta(),aux.getDato()));
            aux = aux.getSiguiente();
        }
        return nuevoConjunto;
    }
    
    public Conjunto interseccion(Conjunto conjunto){
        Conjunto nuevoConjunto = new Conjunto();
        Nodo aux = this.getPrimero();
        while (aux!=null){
            if (conjunto.buscar(aux.getEtiqueta()) != null){
                nuevoConjunto.insertar(new Nodo(aux.getEtiqueta(),aux.getDato()));
            aux = aux.getSiguiente();
            }
        }
        return nuevoConjunto;
    }
    
    @Override
    public boolean insertar(Nodo nodo){
        if (this.buscar(nodo.getEtiqueta()) == null){
            super.insertar(nodo);
            return true;
        }
        return false;
    }
    
    @Override
    public Nodo buscar(Comparable etiqueta){
        Nodo nodo = super.buscar(etiqueta);
        return nodo;
    }
    @Override
    public Nodo getPrimero(){
        return super.getPrimero();
    }
}


