/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_arbolbinariodebusqueda;

/**
 *
 * @author facum
 * @param <T>
 */
public class ArbolBB<T> implements IArbolBB<T> {
    private final INodoABB<T> raiz;
    
    public <T> ArbolBB(INodoABB<T> raiz){
        this.raiz =  (INodoABB) raiz;
    }
    
    @Override
    public void insertar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int contarHojas() {
        if (raiz != null){
            return raiz.contarHojas();
        }
        return -1;
    }

    @Override
    public int tamaño() {
        if (raiz != null){
            return raiz.tamaño();
        }
        return -1;
    }

    @Override
    public int altura() {
        if (raiz != null){
            return raiz.altura();
        }
        return -1;
    }

    @Override
    public boolean esVacio() {
        return raiz == null;
    }

    @Override
    public int sumar() {
        if (raiz != null){
            return raiz.sumar();
        }
        return -1;
    }

    @Override
    public INodoABB<T> getRaiz() {
        return this.raiz;
    }

}
