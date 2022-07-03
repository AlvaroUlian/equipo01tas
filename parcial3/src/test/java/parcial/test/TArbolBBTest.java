
package parcial.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author nnavarro
 */
public class TArbolBBTest
{
    TArbolBB arbolConClaves, arbolVacio;
    TElementoAB raiz, primerElemento, segundoElemento, tercerElemento;
    
    public TArbolBBTest()
    {
        
    }
    
    @BeforeAll
    public static void setUpClass()
    {
        

    }
     
    @BeforeEach
    public void setUp()
    {
       
        arbolConClaves = new TArbolBB<>();
        arbolVacio = new TArbolBB<>();
        
        raiz = new TElementoAB("abstract", "abstract");
        raiz.setCosto(2);
        segundoElemento = new TElementoAB("break", "break");
        segundoElemento.setCosto(3);
        tercerElemento = new TElementoAB("class", "class");
        tercerElemento.setCosto(4);
                
        arbolConClaves.insertar(raiz);
        arbolConClaves.insertar(segundoElemento);
        arbolConClaves.insertar(tercerElemento);
    }

    /**
     * Test of cantYvalorStock method, of class TArbolDeposito.
     */
    @Test
    public void testObtenerCosto()
    {
        setUp();
        
        int expResult = 2;
        long result = arbolConClaves.obtenerCosto(raiz.getEtiqueta());
        
        assertEquals(expResult, result);

    }

    /**
     * Test of piezasPorRubro method, of class TArbolDeposito.
     */
    @Test
    public void testObtenerCosto1()
    {

        // TODO review the generated test code and remove the default call to fail.

    }
    
}
