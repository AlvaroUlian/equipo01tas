/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ta1.ej3;

/**
 *
 * @author facum
 */
public class TElementoAVL<T> implements IElementoAVL<T> {
    
    private Comparable etiqueta;
    private TElementoAVL hijoIzq;
    private TElementoAVL hijoDer;
    private String datos;
    int fEq;

    TElementoAVL(Comparable etiqueta, String dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
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
     
    @Override
     public boolean insertar(IElementoAVL<T> unElemento)
    {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().insertar(unElemento);
            }
            else
            {
                hijoIzq = (TElementoAVL) unElemento;
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
                hijoDer = (TElementoAVL) unElemento;
                return true;
            }
        }
        else
        {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAVL<T> getHijoIzq() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAVL<T> getHijoDer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoIzq(IElementoAVL<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoDer(IElementoAVL<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAVL<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inOrden(Object unaLista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAVL eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int altura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int nivel(Comparable etiqueta, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inOrden(TLista<T> unaLista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
