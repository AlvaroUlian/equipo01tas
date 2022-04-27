/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ute_ta6;

/**
 *
 * @author facum
 */
public class Pila<T> implements IPila<T> {
    private ILista<T> lista = null;
    
    public Pila(){
        this.lista = new Lista();
    }
    @Override
    public boolean apilar(T dato) {
        
        Nodo<T> nodo = new Nodo(dato);
        lista.insertar(nodo);
        return true;
    }

    @Override
    public T desapilar() {
      T datoEliminado = lista.getPrimero().getDato();
      lista.eliminarCabeza();
      return datoEliminado;
        
    }

    @Override
    public T tope() {
        if (lista.getPrimero() != null){
            return lista.getPrimero().getDato();
        }
        return null;
    }

    @Override
    public boolean esVacia() {
        return this.lista.esVacia();
            
    }
    
    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean estaLlena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
