/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial.entidades;

import ucu.edu.uy.tda.IArbolBB;

/**
 *
 * @author nnavarro
 * @param <T>
 */
public interface IArbolDeposito <T extends Pieza>
{
    public StockTotal cantYvalorStock();
    public IArbolBB<Pieza> piezasPorRubro(String unRubro);
}
