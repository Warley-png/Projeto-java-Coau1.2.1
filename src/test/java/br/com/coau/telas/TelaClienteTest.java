/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.telas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Warley
 */
public class TelaClienteTest {
    
    public TelaClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setar_campos method, of class TelaCliente.
     */
    @Test
    public void testSetar_campos() {
        System.out.println("setar_campos");
        TelaCliente instance = new TelaCliente();
        instance.setar_campos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteSelecionadoId method, of class TelaCliente.
     */
    @Test
    public void testGetClienteSelecionadoId() {
        System.out.println("getClienteSelecionadoId");
        TelaCliente instance = new TelaCliente();
        long expResult = 0L;
        long result = instance.getClienteSelecionadoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
