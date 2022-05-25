/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT4_TA9;

import com.mycompany.tda.IElementoAB;
import com.mycompany.tda.TArbolBB;
import com.mycompany.tda.TElementoAB;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author facum
 */
public class TElementoAB_Test {
    
    private static TArbolBB<Integer> arbol1;
    private static TArbolBB arbol2;
    private static TArbolBB arbol3;
    TElementoAB<Integer> nodo1;
    TElementoAB<Integer> nodo2;
    TElementoAB<Integer> nodo3;
    TElementoAB<Integer> nodo4;
    TElementoAB<Integer> nodo5;
    TElementoAB<Integer> nodo6;
    
    public TElementoAB_Test(){
        
    }
    
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        nodo1 = new TElementoAB(1,1);
        nodo2 = new TElementoAB(2,2);
        nodo3 = new TElementoAB(3,3);
        nodo4 = new TElementoAB(4,4);
        nodo5 = new TElementoAB(5,5);
        nodo6 = new TElementoAB(6,6);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getEtiqueta method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetEtiqueta() {
        setUp();
        System.out.println("TEST GET ETIQUETA");
        nodo1 = new TElementoAB(1,1);
        Comparable expResult = 1;
        Comparable result = nodo1.getEtiqueta();
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of setHijoIzq method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testSetHijoIzq() {
        setUp();
        System.out.println("TEST SET HIJO IZQUIERDO");
        nodo1.setHijoIzq(nodo2);
        IElementoAB expResult = nodo2;
        IElementoAB result = nodo1.getHijoIzq();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHijoDer method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testSetHijoDer() {
        setUp();
        System.out.println("TEST SET HIJO DERCECHO");
        nodo1.setHijoDer(nodo2);
        IElementoAB expResult = nodo2;
        IElementoAB result = nodo1.getHijoDer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getHijoIzq method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetHijoIzq() {
        setUp();
        System.out.println("TEST GET HIJO IZQUIERDO");
        nodo1.setHijoIzq(nodo2);
        IElementoAB expResult = nodo2;
        IElementoAB result = nodo1.getHijoIzq();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHijoDer method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetHijoDer() {
        setUp();
        System.out.println("TEST GET HIJO IZQUIERDO");
        nodo1.setHijoDer(nodo2);
        IElementoAB expResult = nodo2;
        IElementoAB result = nodo1.getHijoDer();
        assertEquals(expResult, result);
    }

    /**
     * Test of buscar method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        setUp();
        System.out.println("TEST BUSCAR");
        IElementoAB expResult = nodo2;
        nodo1.setHijoIzq(nodo2);
        IElementoAB result = nodo1.buscar(2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of insertar method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testInsertar() {
        setUp();
        System.out.println("TEST INSERTAR");
        boolean expResult = true;
        boolean result = nodo1.insertar(nodo5);
        assertEquals(expResult, result);
        
    }
    
    
}
