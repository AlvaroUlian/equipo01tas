package com.mycompany.ut4_ta9;

public class Producto implements IProducto {
    
    private final Comparable etiqueta;
    private String nombre;
    private Integer precio;
    private Integer stock;

    public Producto(Comparable etiqueta, String nombre) {
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        this.stock = 0;
        this.precio = 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }
    
    @Override
    public Integer getValorStock(){
        return this.stock * this.precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    public void agregarStock(Integer stock) {
        this.stock += stock;
    }
    
// restarStock devolverá -1 si se pretende extraer más de lo que hay... 
    // y el campo stock quedará inalterado
    public Integer restarStock(Integer unStock) {
        if (this.stock < unStock) {
            return -1;
        } else {
            setStock(this.stock - unStock);
            return this.stock;
        }
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

}
