package com.mycompany.ut3_ta2;

import java.util.ArrayList;

public class Almacen implements IAlmacen {
   public TLista listaProductos;
   private String nombreAlmacen;
   int valorTotalStock = 0;
    
    public Almacen (TLista productos, String nombreAlmacen){
        this.nombreAlmacen = nombreAlmacen;
        this.listaProductos = productos;
    }
    
    // Implementation ----------------
    
    @Override
    public int agregar(IProducto producto){
       if (this.listaProductos != null){
           listaProductos.insertarDelante(producto.getCodigo(), producto);
       } else {
           listaProductos.insertarDelante(producto.getCodigo(), producto);
       }
       return 0;
    }
    
    @Override
    public int cantElementos(){
        return this.valorTotalStock; //Es esta variable u otra?
    }
   
    @Override
    public boolean esVacia() {
        return (this.cantElementos() == 0);
    }
    
    @Override
    public IProducto getPrimero(){
        if (this.esVacia()) System.out.println("Almacen vacio.");
        else {
            //return el poroducto
        }
    }
    
    @Override
    public void imprimir(){
        // es el mismo que listarProductos??
    }
    public void listarProductos(){
        TNodo actual = listaProductos.primero;
        if (this.listaProductos != null && actual != null){  //Si lista no esta vacia y si no llego al final 
            Producto producto = (Producto)actual.dato;
            System.out.println(producto.nombre);
            actual = actual.siguiente;
        }
    }
    
    @Override
    public ArrayList<String> imprimir(String separador){
        // To - Do
    }
    
    @Override
    public IProducto buscarPorCodigo(int codigo){
        if (listaProductos != null){
            TNodo nodoActual = listaProductos.getPrimero();
            while (nodoActual != null){
                IProducto producto = (IProducto) nodoActual.getDato(); //Interesa el tipo Producto dentro de Objet
                if (producto.getCodigo() == codigo){ 
                    return producto;
                }
                nodoActual = nodoActual.getSiguiente();
            }
        }
        return null; //No productos listados o No codigo
    }
    
    @Override
    public IProducto buscarPorDescripcion(String unadescripcion){
        
    }
    
    @Override
    public IProducto eliminar(int unCodigo) {
        
    }
    
    // metodo reducir va?
    public void reducirStock(int reducir, int codigo){
       if (listaProductos != null){
            IProducto producto = this.buscarPorCodigo(codigo);
            producto.setStock((producto.getStock() - reducir));
       }
   }
    
    public void agregarStock(int aumentar, int codigo){
        if (this.listaProductos != null){
            System.out.println("anterior al error");
            IProducto prod = this.buscarPorCodigo(codigo);
            prod.setStock(aumentar);
            if (prod == null){
                System.out.println("No se encontro el código!");
            }
       }
    }
   
    public void listarProductosOrdenadosPorNombre(){
      // To Do 
   }
}
