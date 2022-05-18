/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA2;

/**
 *
 * @author anavalin
 * @param <T>
 */
public class TArbolBB<T> implements IArbolBB<T>{
    private IElementoAB<T> raiz;
    static private int contInsertar;

    @Override
    public boolean insertar(IElementoAB<T> unElemento) {
        contInsertar += 1;
        if(raiz == null){
            this.raiz = unElemento;
            System.out.println(contInsertar);
            return true;
        }else{
            System.out.println(contInsertar);
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
    public TLista<T> inOrden() {
        if(raiz == null){
            return new <T>TLista();
        } else{
            return raiz.inOrden(new <T>TLista());
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
    public int tamaño() {
        if (raiz != null){
            return raiz.tamaño();
        }
        return -1;
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
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
    public int altura() {
        if (raiz != null){
            return raiz.altura();
        }
        return -1;
    }
    
    @Override
    public int nivelNodoABB(Comparable unaEtiqueta) {
        if(this.raiz == null){
            return -1;
        } else{
            return this.raiz.nivelNodoABB(unaEtiqueta);
        }
    }

}
