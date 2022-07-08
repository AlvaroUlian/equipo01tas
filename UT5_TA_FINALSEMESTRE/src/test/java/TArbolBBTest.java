


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author nnavarro
 */
public class TArbolBBTest
{
    TArbolBB arbolConClaves, arbolVacio, arbolPalabras;
    TElementoAB raizCosto, primerElementoCosto, segundoElementoCosto, tercerElementoCosto,
            raizPalabras, primerElementoPalabras, segundoElementoPalabras;
    Lista<Integer> listaPalabras1, listaPalabras2, listaPalabras3;
    
    
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
        
        raizCosto = new TElementoAB("abstract", "abstract");
        raizCosto.setCosto(2);
        segundoElementoCosto = new TElementoAB("break", "break");
        segundoElementoCosto.setCosto(3);
        tercerElementoCosto = new TElementoAB("class", "class");
        tercerElementoCosto.setCosto(4);
                
        arbolConClaves.insertar(raizCosto);
        arbolConClaves.insertar(segundoElementoCosto);
        arbolConClaves.insertar(tercerElementoCosto);
        
        ///
        
        ///
        
        arbolPalabras = new TArbolBB<>();
        
        listaPalabras1 = new Lista<>();
        listaPalabras1.insertar(new Nodo<>(2,2));
        listaPalabras1.insertar(new Nodo<>(1,1));
        listaPalabras1.insertar(new Nodo<>(3,3));
        raizPalabras = new TElementoAB<>("Hola",listaPalabras1);
        arbolPalabras.insertar(raizPalabras);
        
        listaPalabras2 = new Lista<>();
        listaPalabras2.insertar(new Nodo<>(2,2));
        listaPalabras2.insertar(new Nodo<>(1,1));
        listaPalabras2.insertar(new Nodo<>(4,4));
        primerElementoPalabras = new TElementoAB<>("Chau",listaPalabras2);
        arbolPalabras.insertar(primerElementoPalabras);
         
        listaPalabras3 = new Lista<>();
        listaPalabras3.insertar(new Nodo<>(3,3));
        listaPalabras3.insertar(new Nodo<>(5,5));
        listaPalabras3.insertar(new Nodo<>(7,7));
        segundoElementoPalabras = new TElementoAB<>("Hello",listaPalabras3);
        arbolPalabras.insertar(segundoElementoPalabras);
        
        
        
    }

    @Test
    public void testObtenerCosto()
    {
        setUp();
        int expResult = 2;
        long result = arbolConClaves.obtenerCosto(raizCosto.getEtiqueta());
        assertEquals(expResult, result);
        
    }
    @Test
    public void testObtenerCosto2doElem()
    {
        setUp();
        int expResult = 5;
        long result = arbolConClaves.obtenerCosto(segundoElementoCosto.getEtiqueta());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testObtenerCosto3erElem()
    {
        setUp();
        int expResult = 9;
        long result = arbolConClaves.obtenerCosto(tercerElementoCosto.getEtiqueta());
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
    
     @Test
    public void testParesPalabraRaiz_1()
    {
        setUp();
        boolean expResult1 = true;
        boolean expResult2 = true;
        boolean expResult3 = false;
        
        boolean result1 = raizPalabras.paresPalabra("Hola", new Lista<>());
        boolean result2 = raizPalabras.paresPalabra("Chau", new Lista<>());
        boolean result3 = raizPalabras.paresPalabra("Helo", new Lista<>());
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        
    }
    public void testParesPalabraRaiz_2()
    {
        setUp();
        Lista<Integer> lista = arbolPalabras.paresPalabra("Hello");
        
        Nodo nodo = lista.buscar(2);
        int result = (int) nodo.getEtiqueta();
        int expResult = 2;
        assertEquals(result, expResult);
        
    }
}
