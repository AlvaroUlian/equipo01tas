package com.mycompany.ut3_ta2;

public class Almacen {
   public TLista listaProductos;
   private String nombreAlmacen;
     
    public Almacen (TLista productos, String nombreAlmacen){
        this.nombreAlmacen = nombreAlmacen;
   }
   
    public void agregarProducto(Producto producto){
       if (this.listaProductos != null){
           listaProductos.insertar(producto);
       } else {
           TLista listaProductos = new TLista();
           listaProductos.insertar(producto);
       }
   
   }
    public void agregarStock(int aumentar,String codigo){
        if (this.listaProductos != null){
            Producto prod = this.buscarProductoPorCodigo(codigo);
            prod.setStock(aumentar);
            if (prod == null){
                System.out.println("No se encontro el código!");
            }
       }
    }
   public Producto buscarProductoPorCodigo(String codigo){
        if (listaProductos != null){
            TNodo nodoActual = listaProductos.primerNodo;
            while (nodoActual != null){
                Producto producto = (Producto) nodoActual.getDato(); //Interesa el tipo Producto dentro de Objet
                if (producto.codigo == codigo){ 
                    return producto;
                }
                nodoActual = nodoActual.getSiguiente();
            }
        }
        return null; //No productos listados o No codigo
        
    }
   
   public void reducirStock(int reducir,String codigo){
       if (listaProductos != null){
            Producto producto = this.buscarProductoPorCodigo(codigo);
            producto.setStock((-reducir));
       }
          
   }
   
   public void listarProductosOrdenadosPorNombre(){
       
       
       
   }
}
