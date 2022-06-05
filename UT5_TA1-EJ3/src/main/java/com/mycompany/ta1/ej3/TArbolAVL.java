/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ta1.ej3;

/**
 *
 * @author facum
 */

public class TArbolAVL {
    private TElementoAVL raiz;
        
    public boolean insertar(Comparable etiqueta,String dato){
        TElementoAVL nodo = new TElementoAVL(etiqueta,dato);
        if (esVacio()){
            this.raiz = nodo;
            return true;
        }
        if (raiz.insertar(nodo)){
            
            
            if (factorEquilibrio()<-1 || factorEquilibrio()>1){
                this.balancear();
                 return true;
            }
            
        }
        return false;
              
}   
    public boolean esVacio() {
        return (raiz == null);
    }

    public int factorEquilibrio(){
        if (this.raiz == null) {
            return 0;
        }
        else{
            return this.raiz.factorEquilibrio();
        
        }
    }
    public boolean balancear(){
        return true;
    }
}
