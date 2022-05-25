
package ucu.edu.uy.parcial.entidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.TArbolBB;

/**
 *
 * @author nnavarro
 */
public class TArbolDepositoTest
{
    
    public TArbolDepositoTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
        
    }
    
    @BeforeEach
    public void setUp()
    {
        Pieza pieza1 = new Pieza("0986580100","17.4.1","descripcion",1,1);
        Pieza pieza2 = new Pieza("0986580200","17.4.2","descripcion",1,1);
        Pieza pieza3 = new Pieza("0986580300","17.4.3","descripcion",1,1);
        Pieza pieza4 = new Pieza("0986580400","17.4.4","descripcion",1,1);
        IElementoArbolDeposito<Pieza> elemAdeposito1 = new TElementoArbolDeposito<>(pieza1.getCodigo(),pieza1);
        IElementoArbolDeposito<Pieza> elemAdeposito2 = new TElementoArbolDeposito<>(pieza2.getCodigo(),pieza2); 
        IElementoArbolDeposito<Pieza> elemAdeposito3 = new TElementoArbolDeposito<>(pieza3.getCodigo(),pieza3); 
        IElementoArbolDeposito<Pieza> elemAdeposito4 = new TElementoArbolDeposito<>(pieza4.getCodigo(),pieza4); 
        
        TArbolBB<Pieza> arbolBBpieza = new TArbolBB<>();
        
        
    }

    /**
     * Test of cantYvalorStock method, of class TArbolDeposito.
     */
    @Test
    public void testCantYvalorStock()
    {
        
        StockTotal stockTotal = new StockTotal();
        TElementoArbolDeposito<Pieza> nodoPieza = this.getRaizArbolDeposito();
        if (nodoPieza!=null){
            nodoPieza.cantYvalorStock(stockTotal);
        }
        return stockTotal;

    }

    /**
     * Test of piezasPorRubro method, of class TArbolDeposito.
     */
    @Test
    public void testPiezasPorRubro()
    {

        // TODO review the generated test code and remove the default call to fail.

    }
    
}
