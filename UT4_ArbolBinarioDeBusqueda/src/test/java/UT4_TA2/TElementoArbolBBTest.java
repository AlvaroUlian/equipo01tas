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
public class TElementoArbolBBTest {
    
    public TElementoArbolBBTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getEtiqueta method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetEtiqueta() {
        System.out.println("getEtiquetaTest");
        TElementoArbolBB instance = null;
        Comparable expResult = null;
        Comparable result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoIzq method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHijoDer method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoIzq method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        TElementoArbolBB instance = null;
        instance.setHijoIzq(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHijoDer method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        TElementoArbolBB instance = null;
        instance.setHijoDer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testInsertar() {
        System.out.println("insertar");
        TElementoArbolBB instance = null;
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testInOrden() {
        System.out.println("inOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TElementoArbolBB instance = null;
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testGetDatos() {
        System.out.println("getDatos");
        TElementoArbolBB instance = null;
        Object expResult = null;
        Object result = instance.getDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamaño method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        IElementoAB expResult = null;
        IElementoAB result = instance.eliminar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarHojas method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testContarHojas() {
        System.out.println("contarHojas");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.contarHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altura method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testAltura() {
        System.out.println("altura");
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.altura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nivelNodoABB method, of class TElementoArbolBB.
     */
    @org.junit.jupiter.api.Test
    public void testNivelNodoABB() {
        System.out.println("nivelNodoABB");
        Comparable unaEtiqueta = null;
        TElementoArbolBB instance = null;
        int expResult = 0;
        int result = instance.nivelNodoABB(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
