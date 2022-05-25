/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA9;

import com.mycompany.tda.IElementoAB;
import com.mycompany.tda.Lista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.mycompany.tda.TArbolBB;
import com.mycompany.tda.TElementoAB;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author facum
 */
public class TArbolBB_Test {
    
    private static TArbolBB<Integer> arbol1;
    
    TElementoAB<Integer> nodo1;
    TElementoAB<Integer> nodo2;
    TElementoAB<Integer> nodo3;
    TElementoAB<Integer> nodo4;
    TElementoAB<Integer> nodo5;
    TElementoAB<Integer> nodo6;
            
    
    public TArbolBB_Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        arbol1 = new TArbolBB();
                
        nodo1 = new TElementoAB(1,1);
        nodo2 = new TElementoAB(2,2);
        nodo3 = new TElementoAB(3,3);
        nodo4 = new TElementoAB(4,4);
        nodo5 = new TElementoAB(5,5);
        nodo6 = new TElementoAB(6,6);
        
        arbol1.insertar(nodo1);
        arbol1.insertar(nodo2);
        arbol1.insertar(nodo3);
        arbol1.insertar(nodo4);
        arbol1.insertar(nodo5);
        arbol1.insertar(nodo6);
    }
    
    @AfterEach
    public void tearDown() {
    }
    
     /**
     * Test of buscar method, of class TArbolBB.
     */
    
    @Test
    public void testInsertar() {
        setUp();
        System.out.println("TEST INSERTAR");
        int tamanio = arbol1.getRaiz().tamanio();
        assertEquals(tamanio,6);
    }
    
    @Test
    public void testBuscar() {
        setUp();
        System.out.println("TEST BUSCAR DE ARBOL/ELEMENTO");
        
        IElementoAB<Integer> elem1 = arbol1.buscar(1);
        IElementoAB<Integer> elem2 = arbol1.buscar(2);
        IElementoAB<Integer> elem3 = arbol1.buscar(3);
        IElementoAB<Integer> elem4 = arbol1.buscar(4);
        IElementoAB<Integer> elem5 = arbol1.buscar(5);
        IElementoAB<Integer> elem6 = arbol1.buscar(6);
        
        
        assertEquals(elem6,nodo6);
        assertEquals(elem6.getDatos(), 6);
        assertEquals(elem5,nodo5);
        assertEquals(elem5.getDatos(), 5);
        assertEquals(elem4,nodo4);
        assertEquals(elem4.getDatos(), 4);
        assertEquals(elem3,nodo3);
        assertEquals(elem3.getDatos(), 3);
        assertEquals(elem2,nodo2);
        assertEquals(elem2.getDatos(), 2);
        assertEquals(elem1,nodo1);
        assertEquals(elem1.getDatos(), 1);
    }

    /**
     * Test of preOrdenEtiqueta method, of class TArbolBB.
     */
    @Test
    public void testpreOrdenEtiqueta() {
        setUp();
        System.out.println("TEST PRE ORDEN ETIQUETA DE ARBOL/ELEMENTO");
        
        String expResult = "1-2-3-4-5-6";
        String result = arbol1.preOrdenEtiqueta();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscar inOrdenListaDatos, of class TArbolBB.
     */
    @Test
    public void testInOrdenListaDatos() {
        setUp();
        System.out.println("TEST IN ORDEN LISTA DATOS DE ARBOL/ELEMENTO");
        
        Lista elem = arbol1.inOrdenListaDatos();
        int expResult = 6;
        
        assertEquals(elem.cantElementos(),6);
        assertEquals(expResult,elem.cantElementos());
        
    }
    
}
