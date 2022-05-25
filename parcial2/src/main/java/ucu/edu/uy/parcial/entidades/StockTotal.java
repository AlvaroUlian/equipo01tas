/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial.entidades;

/**
 *
 * @author nnavarro
 */
public class StockTotal
{

    private int cantidadPiezas;
    private int valorStok;

    public StockTotal()
    {
        this.cantidadPiezas = 0;
        this.valorStok = 0;
    }

    public int getCantidadPiezas()
    {
        return cantidadPiezas;
    }

    public void setCantidadPiezas(int cantidadPiezas)
    {
        this.cantidadPiezas = cantidadPiezas;
    }

    public int getValorStok()
    {
        return valorStok;
    }

    public void setValorStok(int valorStok)
    {
        this.valorStok = valorStok;
    }

}
