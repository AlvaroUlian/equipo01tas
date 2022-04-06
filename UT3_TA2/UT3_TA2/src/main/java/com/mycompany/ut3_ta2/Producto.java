package com.mycompany.ut3_ta2;

public class Producto implements IProducto {
    int precio;
    String nombre;
    int codigo;
    int stock = 0;
    String descripcion;
            
    public Producto(int precio, String nombre, int codigo, int stock, String descripcion){
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.descripcion = descripcion;
    }
    
    // Implementation --------
    @Override
    public int getCodigo(){
        return this.codigo;
    }
    @Override
    public String getDescripcion(){
        return this.descripcion;
    }
    @Override
    public int getPrecio(){
        return this.precio;
    }
    @Override
    public int getStock(){
        return this.stock;
    }
    @Override
    public void setStock(int valor){
        this.stock += valor;
    }
    @Override
    public void setSiguiente(IProducto producto){
        
    }
    @Override
    public IProducto getSiguiente(){
        
    }
    @Override
    public void agregarStock(int stock){
        this.stock += stock;
    }
    @Override
    public int restarStock(int stock){
        return this.stock -= stock;
    }
    @Override
    public void imprimir(){
        
    }
    @Override
    public String imprimir(String separador){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre);
        sb.append(separador);
        sb.append(this.precio);
        sb.append(separador);
        return sb.toString();
    }
}
