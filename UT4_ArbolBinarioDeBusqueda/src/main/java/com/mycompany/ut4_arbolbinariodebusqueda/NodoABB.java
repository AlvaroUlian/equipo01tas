/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_arbolbinariodebusqueda;

/**
 *
 * @author facum
 */
public class NodoABB<T> implements INodoABB<T> {
    private INodoABB<T> hijoIzq;
    private INodoABB<T> hijoDer;
    
    @Override
    public void contarHojas() {
        if (hijoIzq == nulo && hijoDere == nulo){
		return 1;
        }
	
	if (hijoIzq != nulo){
		cantIzq = hijoIzq.contarHojas();
        }
	
	if (hijoDer != nulo){
		cantDer = hijoDer.contarHojas();
        }
	return cantIzq + cantDer;
        
    }

    @Override
    public void tamaño() {
        if (hijoIzq != nulo){
		cantIzq = hijoIzq.altura()
        }
	if (hijoDer != nulo){
		cantDer = hijoDer.altura()
        }
	
	return hijoIzq + hijoDer  + 1
    }

    @Override
    public void altura() {
        if (hijoIzq != nulo){
		cantIzq = hijoIzq.altura()
        }
	if (hijoDer != nulo){
		cantDer = hijoDer.altura()
        }
	
	return max(izq, drc) + 1;
        
    }

    @Override
    public void esVacio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
