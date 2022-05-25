/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author facum
 */
public interface IArbolProducto<T> {
    /**
     * Devuelve una lista de tipo entero, con la cantidad y el valor de un Producto.
     * @return int[] 
     */
    public int[] cantidadYvalorStock();
    /**
     * devuelve una lista ordenada por etiqueta de tipo String, etiqueta/nombre/cantidad.
     * @return String[];
     */
    public String etiquetaNombreCantidad();
}
