/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA2;

/**
 *
 * @author anavalin
 */
public class TArbolBB<T> implements IArbolBB<T>{
    
    private IElementoAB raiz;

    @Override
    public boolean insertar(IElementoAB<T> unElemento) {
        if(raiz == null){
            this.raiz = unElemento;
            return true;
        }else{
            return raiz.insertar(unElemento);
        }
    }

    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
        if(this.raiz == null){
            return null;
        } else{
            return this.raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if(this.raiz == null){
            return null;
        } else{
            return this.raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        if(this.raiz == null){
            return null;
        } else{
            return this.raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
       if(this.raiz == null){
            return null;
        } else{
            return this.raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
