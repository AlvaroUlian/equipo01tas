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
public interface IElementoArbolDeposito<T extends Pieza>
{
    public void cantYvalorStock(StockTotal stockTotal);
    public void piezasPorRubro(String unRubro, IArbolBB<Pieza> arbolPiezas);
}
