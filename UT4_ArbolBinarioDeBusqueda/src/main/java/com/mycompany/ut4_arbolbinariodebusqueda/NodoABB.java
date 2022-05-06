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
    public int getValor(){
        return this.valor;
    }
    
}
