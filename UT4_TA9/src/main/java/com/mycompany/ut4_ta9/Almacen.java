package com.mycompany.ut4_ta9;


import com.mycompany.tda.IElementoAB;
import com.mycompany.tda.ILista;
import com.mycompany.tda.INodo;
import com.mycompany.tda.TArbolBB;
import com.mycompany.tda.TElementoAB;

public class Almacen implements IAlmacen {

    private final String nombre;
    private String direccion;
    private String telefono;
    private Integer stockAlmacen;
    private Integer valorStockAlmacen;
    private Integer catidadInsertadosAlmacen;

    private final TArbolBB<Producto> productos; //El Almacen contiene el ARBOL de productos.

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<>(); //Se crea el ARBOL de tipo PRODUCTO.
        this.stockAlmacen = 0;
        this.valorStockAlmacen = 0;
        this.catidadInsertadosAlmacen = 0;
        
    }
    
    @Override
    public Integer getValorStockAlmacen(){
        return this.valorStockAlmacen;
    }
    @Override
    public Integer getStockAlmacen(){
        return this.stockAlmacen;
    }
    
    @Override
    public void setValorStockAlmacen(int valor){
        this.valorStockAlmacen = valor;
    }
    
    @Override
    public void setStockAlmacen(int cantidad){
        this.stockAlmacen = cantidad;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        IElementoAB<Producto> elementoAB = new TElementoAB<>(unProducto.getEtiqueta(),unProducto);
        if (productos.insertar(elementoAB)){
            System.out.println("SE DA ALTA A UN NUEVO PRODUCTO : " + unProducto.getNombre());
            
            this.setValorStockAlmacen(this.getValorStockAlmacen()+unProducto.getValorStock());
            this.setStockAlmacen(this.getStockAlmacen()+unProducto.getStock());
            
        }else{
            if (this.agregarStock(unProducto.getEtiqueta(), unProducto.getStock())){ 
                System.out.println(unProducto.getNombre() + " -> AMUENTO SU STOCK :" + unProducto.getStock());
                this.setValorStockAlmacen(this.getValorStockAlmacen()+unProducto.getValorStock());
                this.setStockAlmacen(this.getStockAlmacen()+unProducto.getStock());
                               
            } else{
                System.out.println(unProducto.getNombre() + " NO SE PUDO INSERTAR PRODUCTO.");
            }
        }
        unProducto = null; //producto meramente auxiliar sirve hasta poder dar las altas reales.
        elementoAB = null; //elementoAB meramente auxiliar sirve hasta poder dar las altas reales.
    }

    @Override
    public String getEtiquetas() {
        return productos.preOrdenEtiqueta(); //String con formato etiqueta - etiqueta.
    }
    
    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Producto productoBuscado = this.buscarPorCodigo(clave);
        
        if (productoBuscado!=null){
            productoBuscado.agregarStock(cantidad);
            
            return true;
        }
        System.out.println("NO SE ENCONTRO PRODUCTO.");
        return false;    
        
    }

    @Override
    public Boolean restarStock(Comparable clave, Integer cantidad) {
        Producto productoBuscado = this.buscarPorCodigo(clave);
        
        if (productoBuscado != null){
            System.out.println("******El producto "+productoBuscado.getEtiqueta()+"/"+productoBuscado.getStock()+" de Almacen antes de modificar*******");
            if (productoBuscado.restarStock(cantidad) >= 0){
                System.out.println("******El producto "+productoBuscado.getEtiqueta()+"/"+productoBuscado.getStock()+" de Alacen luego de modificar*******");
                this.setValorStockAlmacen(this.getValorStockAlmacen()-productoBuscado.getValorStock());
                this.setStockAlmacen(this.getStockAlmacen()-productoBuscado.getStock());
                System.out.println("SE PROCESA LA VENTA DE " + productoBuscado.getNombre() + " CORRECTAMENTE.");
                return true;
            }
            System.out.println("NO SE REALIZAN CAMBIOS EN PRODUCTO : " + productoBuscado.getNombre() + " STOCK VENDIDO SUPERA AL REGISTRADO ACTUALMENTE");
            return false;
        }
        System.out.println("LA CLAVE "+clave+" NO ESTA REGISTRADA EN EL PROGRAMA, NO SE PUEDE DAR ALTA A ESA VENTA");
        return false;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        IElementoAB<Producto> elementoBuscado = this.productos.buscar(clave);
        if (elementoBuscado != null){
            return elementoBuscado.getDatos();
        }
        return null;
    }

    @Override
    public void eliminarProducto(Comparable clave) {
        productos.eliminar(clave);
    }

    @Override
    public String[] listarProductos() {
        ILista<Producto> listaProductos =  productos.inOrdenListaDatos(); //Lista compuesta de etiqueta y el dato. Tambien se prueba hacer en TArbolProducto<Producto>
        INodo<Producto> nodoProducto = listaProductos.getPrimero();
        
        String[] listaStringProducto = new String[listaProductos.cantElementos()];
        int indice = 0;
        while (nodoProducto != null){
            listaStringProducto[indice] = nodoProducto.getEtiqueta()+ "/" + nodoProducto.getDato().getNombre() + "/" + nodoProducto.getDato().getStock().toString() + "\n";
            nodoProducto = nodoProducto.getSiguiente();
            indice += 1;
        }
        return listaStringProducto;
    }


}
