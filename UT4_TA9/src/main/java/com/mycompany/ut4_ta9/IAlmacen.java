package com.mycompany.ut4_ta9;

public interface IAlmacen {
    
    /**
     * Retorna el valor total del almacen
     * @return Integer
     */

    public Integer getValorStockAlmacen();
    
    /**
     * devuelve el stock total del alamcen
     * @return Integer
     */
    
    public Integer getStockAlmacen();
   
    /**
     * Incorporar un nuevo producto al supermercado.
     *
     * @param unProducto
     */
    public void insertarProducto(Producto unProducto);
    
    /**
     * devuelve una lista de todos los productos del alamcen.
     * @return String[]
     */
    
    public String[] listarProductos();

    /**
     * Eliminar productos que ya no se venden (por no ser comercializados m�s).
     *
     * @param clave
     * @return
     */
    public void eliminarProducto(Comparable clave);

    /**
     * Imprime la lista de productos
     *
     * @return
     */
    public String getEtiquetas();

   
    public Boolean agregarStock(Comparable clave, Integer cantidad);

    /**
     * Simular la venta de un producto (reducir el stock de un producto
     * existente
     *
     * @param clave
     * @param cantidad
     * @return
     */
    public Boolean restarStock(Comparable clave, Integer cantidad);

    /**
     * Dado un código de producto, indicar las existencias del mismo en el
     * almac�n.
     *
     * @param clave
     * @return
     */
    public Producto buscarPorCodigo(Comparable clave);
    
    /**
     * edita el valor total del almacen
     * @return 
     */
    
    public void setValorStockAlmacen(int cantidad);
    
    
    /**
     * edita el stock total del almacen
     * @param cantidad 
     */
    public void setStockAlmacen(int cantidad);

   
    
}
