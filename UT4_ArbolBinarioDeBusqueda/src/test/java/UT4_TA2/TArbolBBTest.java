/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package UT4_TA2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anavalin
 */
public class TArbolBBTest {
    
    private static TArbolBB<Integer> arbol1;
    private static TArbolBB arbol2;
    private static TArbolBB arbol3;
    TElementoArbolBB<Integer> nodo1;
    TElementoArbolBB<Integer> nodo2;
    TElementoArbolBB<Integer> nodo3;
    TElementoArbolBB<Integer> nodo4;
    TElementoArbolBB<Integer> nodo5;
    TElementoArbolBB<Integer> nodo6;
            
    
    public TArbolBBTest() {
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
        arbol2 = new TArbolBB();
        arbol3 = new TArbolBB();
        
        nodo1 = new TElementoArbolBB(1,1);
        nodo2 = new TElementoArbolBB(2,2);
        nodo3 = new TElementoArbolBB(3,3);
        nodo4 = new TElementoArbolBB(4,4);
        nodo5 = new TElementoArbolBB(5,5);
        nodo6 = new TElementoArbolBB(6,6);
        
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
     * Test of insertar method, of class TArbolBB.
     */
    @Test
    public void testInsertar() {
        setUp();
        
        System.out.println("Test insertar");
        String expResult = "1-2-3-4-5-6-";
        String result = arbol1.inOrden();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of buscar method, of class TArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("Test buscar");
        setUp();
        
        IElementoAB<Integer> elem = arbol1.buscar(5);
        assertEquals(elem,nodo5);
        assertEquals(elem.getDatos(), 5);
        
    }

    
}
