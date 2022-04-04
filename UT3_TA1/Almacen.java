package com.mycompany.ut3_ta1;

public class Almacen {
   private TLista productos;
      private String nombre;

   public Almacen(TLista productos, String nombre) {
        this.productos = productos;
        this.nombre = nombre;
   }
   
   //public methods
    public void agregarProducto(Producto producto){
       if (producto == null) System.out.println("Error con el producto");
       if (this.listaProductos != null) {
           productos.insertar(producto);
       } else {
           TLista productos = new TLista();
           listaProductos.insertar(producto);
       }
   }
   
    public void agregarStock(int aumentarStock, String codigo){
       TNodo nodo = productos.buscar(codigo); 
       if (nodo != null) {
            Producto prod = (Producto) nodo.getDato();
            prod.setStock(prod.getStock() + aumentarStock);
       } else { System.out.println("Producto no encontrado"); }
    }
   
   public Producto buscarProductoPorCodigo(String codigo){
      if (codigo == null) System.out.println("Error en el código");  
      if (productos != null){
            TNodo nodoActual = productos.primerNodo;
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
       if (productos != null){
            Producto producto = this.buscarProductoPorCodigo(codigo);
            producto.setStock((-reducir));
       }
          
   }
   
   public void listarProductosOrdenadosPorNombre(){
       
   }
}
