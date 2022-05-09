/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA2;

/**
 *
 * @author anavalin
 */
public class TElementoArbolBB<T> implements IElementoAB<T>{
    
    private Comparable etiqueta;
    private IElementoAB<T> izquierdo;
    private IElementoAB<T> derecho;
    private T dato;

    @Override
    public Comparable getEtiqueta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB<T> getHijoIzq() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB<T> getHijoDer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoIzq(IElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setHijoDer(IElementoAB<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
        IElementoAB<T> nodo = null;
        if (this.etiqueta == unaEtiqueta){
            return this;
        }
        if (izquierdo != null){
            nodo = izquierdo.buscar(unaEtiqueta);
        }
        if (derecho != null && nodo == null){
            nodo = derecho.buscar(unaEtiqueta);
        }
        return nodo;
    }

    @Override
    public boolean insertar(IElementoAB<T> elemento) {
        if(elemento.getEtiqueta().compareTo(etiqueta) < 0){
            if(this.izquierdo != null){
                return getHijoIzq().insertar(elemento);
            }else{
                this.izquierdo = elemento;
                return true;
            }
        }else if(elemento.getEtiqueta().compareTo(etiqueta) > 0){
            if(this.derecho != null){
                return getHijoDer().insertar(elemento);
            }else{
                this.derecho = elemento;
                return true;
            }
        }else{
            return false;
        }
    }

    @Override
    public String preOrden() {
        String resultado = "";
        resultado = resultado + this.getEtiqueta().toString() + "-";
        if(this.getHijoIzq() != null){
            resultado = resultado + getHijoIzq().preOrden();
        }
        if(this.getHijoDer() != null){
            resultado = resultado + getHijoDer().preOrden();
        }
        return resultado;
    }

    @Override
    public String inOrden() {
        
        String resultado = "";
        if(this.getHijoIzq() != null){
            resultado = resultado + getHijoIzq().inOrden();
        }
        resultado = resultado + this.getEtiqueta().toString() + "-";
        if(this.getHijoDer() != null){
            resultado = resultado + getHijoDer().inOrden();
        }
        return resultado;
    }

    @Override
    public String postOrden() {
        
        String resultado = "";
        if(this.getHijoIzq() != null){
            resultado = resultado + getHijoIzq().postOrden();
        }
        if(this.getHijoDer() != null){
            resultado = resultado + getHijoDer().postOrden();
        }
        resultado = resultado + this.getEtiqueta().toString() + "-";
        return resultado;
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
