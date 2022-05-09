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
public interface INodoABB<T> {
    
    public INodoABB<T> buscar(int valor);
    public int contarHojas();
    public int tamaño();
    public int altura();
    public int sumar();
    public int cantNodosNivel(int nivel);
    public int cantNodosInternos();
    public int cantNodosCompletos();    
    public int getValor();
    public INodoABB<T> getIzq();
    public INodoABB<T> getDer();
}
