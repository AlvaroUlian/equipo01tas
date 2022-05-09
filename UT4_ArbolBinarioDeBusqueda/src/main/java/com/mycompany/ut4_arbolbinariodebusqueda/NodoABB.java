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
public class NodoABB<T> implements INodoABB<T> {
    private INodoABB<T> hijoIzq;
    private INodoABB<T> hijoDer;
    private final int valor;

    public <T> NodoABB(INodoABB<T> hijoIzq,INodoABB<T> hijoDer) {
        this.valor = 0;
    }
    
    @Override
    public INodoABB<T> buscar(int valor) {
        INodoABB<T> nodo = null;
        if (this.valor == valor){
            return this;
        }
        if (hijoIzq != null){
            nodo = hijoIzq.buscar(valor);
        }
        if (hijoDer != null && nodo == null){
            nodo = hijoDer.buscar(valor);
        }
        return nodo;
    }
    
    @Override
    public int contarHojas() {
        int cantIzq = 0;
        int cantDer = 0;
        
        if (hijoIzq == null && hijoDer == null){
		return 1;
        }
	if (hijoIzq != null){
		cantIzq = hijoIzq.contarHojas();
        }
	if (hijoDer != null){
		cantDer = hijoDer.contarHojas();
        }
	return cantIzq + cantDer;
    }

    @Override
    public int tamaño() {
        int cantIzq = 0;
        int cantDer = 0;
        
        if (hijoIzq != null){
		cantIzq = hijoIzq.tamaño();
        }
	if (hijoDer != null){
		cantDer = hijoDer.tamaño();
        }
	return cantIzq + cantDer  + 1;
    }

    @Override
    public int altura(){
        int cantIzq = 0;
        int cantDer = 0;
        
        if (hijoIzq != null){
		cantIzq = hijoIzq.altura();
        }
	if (hijoDer != null){
		cantDer = hijoDer.altura();
        }
	return Math.max(cantIzq,cantDer)+1;
    }

    @Override
    public int sumar() {
        int cantIzq = 0;
        int cantDer = 0;
        
        if (hijoIzq != null){
            cantIzq = hijoIzq.sumar();
        }
        if (hijoDer != null){
            cantDer = hijoDer.sumar();
        }
        return cantIzq + cantDer + this.getValor();
    }

    @Override
    public int cantNodosNivel(int nivel) {
        int cantIzq = 0;
        int cantDer = 0;
        
        if (nivel == 0){
            return 1;
        }
        if (hijoIzq != null){
            cantIzq = hijoIzq.cantNodosNivel(nivel-1);
        }
        if (hijoDer != null){
            cantDer = hijoDer.cantNodosNivel(nivel-1);
        }
        return cantIzq + cantDer;
    }
    @Override
    public int cantNodosInternos() {
        int cantIzq = 0;
        int cantDer = 0;
        
       
        if (hijoIzq != null){
            cantIzq = hijoIzq.cantNodosInternos();
        }
        if (hijoDer != null){
            cantDer = hijoDer.cantNodosInternos();
        }
        
        if (hijoIzq != null || hijoDer != null){
            return 1;
        }
        return 0;
    }
    @Override
    public int cantNodosCompletos() {
        int cantIzq = 0;
        int cantDer = 0;
        
       
        if (hijoIzq != null){
            cantIzq = hijoIzq.cantNodosCompletos();
        }
        if (hijoDer != null){
            cantDer = hijoDer.cantNodosCompletos();
        }
        
        if (hijoIzq != null && hijoDer != null){
            return 1;
        }
        return 0;
    }
    
    @Override
    public int getValor(){
        return this.valor;
    }
    
    @Override
    public INodoABB<T> getIzq(){
        return this.hijoIzq;
    }
    
    @Override
    public INodoABB<T> getDer(){
        return this.hijoIzq;
    }
    
    
    
}
