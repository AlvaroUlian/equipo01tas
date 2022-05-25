/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial.entidades;

/**
 *
 * @author nnavarro
 */
public class Pieza
{

    private String codigo;
    private String codCatalogo;
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    public Pieza()
    {
    }

    public Pieza(String codigo, String codCatalogo, String descripcion, int cantidad, int precioUnitario)
    {
        this.codigo = codigo;
        this.codCatalogo = codCatalogo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public boolean tieneRubro(String rubro)
    {
        String[] split = this.codCatalogo.split("\\.");
        return rubro.compareTo(split[0]) == 0; //RETORNA TRUE SI EL RUBRO ES IGUAL AL DE LA PIEZA ACTUAL, FALSE DE LO CONTRARIO.
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.codigo)
                .append(",")
                .append(this.codCatalogo)
                .append(",")
                .append(this.descripcion)
                .append(",")
                .append(this.cantidad)
                .append(",")
                .append(this.precioUnitario)
                .toString();
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getCodCatalogo()
    {
        return codCatalogo;
    }

    public void setCodCatalogo(String codCatalogo)
    {
        this.codCatalogo = codCatalogo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario()
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario)
    {
        this.precioUnitario = precioUnitario;
    }

}
