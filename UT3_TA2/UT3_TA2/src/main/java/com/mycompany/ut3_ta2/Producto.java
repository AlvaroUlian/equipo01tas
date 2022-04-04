/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta1;

/**
 *
 * @author facum
 */
public class Producto {
    float precio;
    String nombre;
    String codigo;
    int stock = 0;
            
    public Producto(float precio,String nombre, String codigo){
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public Producto getProducto(){
        
     return this;
    }
    
    public void setStock(int valor){
        this.stock += valor;
    }
    
    public void setPrecio (float precio){
        
      this.precio = precio;
    }
}
