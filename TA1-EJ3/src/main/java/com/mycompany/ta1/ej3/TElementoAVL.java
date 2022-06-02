/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ta1.ej3;

/**
 *
 * @author facum
 */
public class TElementoAVL {
    
    private Comparable etiqueta;
    private TElementoAVL hijoIzq;
    private TElementoAVL hijoDer;
    private String datos;
    int fEq;
    
     public int factorEquilibrio(){
        int altIzq = -1;
        int altDer = -1;
        
        if (this.hijoIzq != null) {
            altIzq = this.hijoIzq.factorEquilibrio();
        }
        if (this.hijoDer != null) {
            altDer = this.hijoDer.factorEquilibrio();
        }
        this.fEq = altDer - altIzq;
       return Math.max(altDer, altIzq) + 1;
    }
     
     public boolean insertar(IElementoAB<T> unElemento)
    {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().insertar(unElemento);
            }
            else
            {
                hijoIzq = unElemento;
                return true;
            }
        }
        else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0)
        {
            if (hijoDer != null)
            {
                return getHijoDer().insertar(unElemento);
            }
            else
            {
                hijoDer = unElemento;
                return true;
            }
        }
        else
        {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }
    
}
