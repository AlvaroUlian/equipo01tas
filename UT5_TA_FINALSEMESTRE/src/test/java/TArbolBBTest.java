


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

    @Test
    public void testObtenerCosto()
    {
        setUp();
        int expResult = 2;
        long result = arbolConClaves.obtenerCosto(raiz.getEtiqueta());
        assertEquals(expResult, result);
        
    }
    @Test
    public void testObtenerCosto2doElem()
    {
        setUp();
        int expResult = 5;
        long result = arbolConClaves.obtenerCosto(segundoElemento.getEtiqueta());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerCosto3erElem()
    {
        setUp();
        int expResult = 9;
        long result = arbolConClaves.obtenerCosto(tercerElemento.getEtiqueta());
        assertEquals(expResult, result);
    }
       
    @Test
    public void testObtenerCostoNoElem()
    {
        setUp();
        int expResult = 0;
        long result = arbolConClaves.obtenerCosto(new TElementoAB("do", "do").getEtiqueta());
        assertEquals(expResult, result);
    }
}
