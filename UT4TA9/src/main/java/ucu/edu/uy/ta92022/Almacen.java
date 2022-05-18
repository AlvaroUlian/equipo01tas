package ucu.edu.uy.ta92022;


import ucu.edu.uy.tda.*;

public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;

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
            int stockActual = dato.getStock();    // obtenemos el stock al momento de ese Producto
            dato.setStock(stockActual + cantidad);     // sumamos stock
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
 
   


  

   

   

   

}
