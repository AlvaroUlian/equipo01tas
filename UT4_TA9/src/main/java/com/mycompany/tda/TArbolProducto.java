/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

import com.mycompany.ut4_ta9.Producto;

/**
 *
 * @author facum
 */
public class TArbolProducto extends TArbolBB<Producto> implements IArbolProducto {
    
    @Override
    public int[] cantidadYvalorStock(){
        INodo<Producto> producto = this.inOrdenListaDatos().getPrimero(); //TLista<T> que contiene Etiqueta del producto y dato el Producto.
        int[] retorno = new int[2];
        while (producto != null) {
            retorno[0] += producto.getDato().getStock();
            retorno[1] += producto.getDato().getValorStock();
            producto =producto.getSiguiente();
        }
        return retorno; //lista de dos elementos total stock, valor total stock
    }

    @Override
    public String etiquetaNombreCantidad() {
        INodo<Producto> nodoProducto = this.inOrdenListaDatos().getPrimero(); //TLista<T> que contiene Etiqueta del producto y dato el Producto.
        String retorno = "";
        while (nodoProducto != null){
            retorno += nodoProducto.getEtiqueta().toString() +"/"+ nodoProducto.getDato().getNombre() +"/"+ nodoProducto.getDato().getStock()+"\n";
            nodoProducto = nodoProducto.getSiguiente();
        }
        return retorno;
    }
    
}
