package ucu.edu.uy.ta92022;


import ucu.edu.uy.tda.*;

public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;
    private int stockTotal;
    
    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        productos.insertar(new TElementoAB(unProducto.getEtiqueta(), unProducto));
    }

    @Override
    public String imprimirProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        if(productos.buscar(clave) != null){
            IElementoAB<Producto> elem = productos.buscar(clave);  //buscamos producto el arbol de productos usando clave
            Producto dato = elem.getDatos();     // del Nodo encontrado en el arbol de prodcutos, obtenemos el Dato que es el Producto
            dato.agergarStock(cantidad);
            return true;
        }else{
            //Si el producto no existe en el arbol de Productos, lo agregamos con su stock
            Producto prod = new Producto(clave, (String) clave);
            prod.setStock(cantidad);
            IElementoAB aux = new TElementoAB(clave, prod);
            productos.insertar(aux);
            return false;
        }
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        if (productos.buscar(clave) != null) {
            IElementoAB<Producto> elem = productos.buscar(clave);
            Producto dato = elem.getDatos();     // del Nodo encontrado en el arbol de prodcutos, obtenemos el Dato que es el Producto
            return dato.restarStock(cantidad);
        }else{
        return 0;}
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        if (productos.buscar(clave) != null) {
            return productos.buscar(clave).getDatos();
        }else{
        return null;
        }
        
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        if (productos.buscar(clave) != null) {
            productos.eliminar(clave);
            return true;
        }else{return false;}
    }


   
 
   


  

   

   

   

}
