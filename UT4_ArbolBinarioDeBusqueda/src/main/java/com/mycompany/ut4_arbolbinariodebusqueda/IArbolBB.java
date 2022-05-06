/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ut4_arbolbinariodebusqueda;

/**
 *
 * @author facum
 * @param <T>
 */
public interface IArbolBB <T> {

    public int contarHojas();
    public int tamaño();
    public int altura();
    public boolean esVacio();
    public int sumar();
    public INodoABB<T> getRaiz();
    public void insertar();
}

