/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.persistence;

import java.util.Date;
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
public class AlugarLivroTest {
    
    public AlugarLivroTest() {
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
     * Test of getIdret method, of class AlugarLivro.
     */
    @Test
    public void testGetIdret() {
        System.out.println("getIdret");
        AlugarLivro instance = new AlugarLivro();
        long expResult = 0L;
        long result = instance.getIdret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdret method, of class AlugarLivro.
     */
    @Test
    public void testSetIdret() {
        System.out.println("setIdret");
        long idret = 0L;
        AlugarLivro instance = new AlugarLivro();
        instance.setIdret(idret);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class AlugarLivro.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        AlugarLivro instance = new AlugarLivro();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class AlugarLivro.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        AlugarLivro instance = new AlugarLivro();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLivro method, of class AlugarLivro.
     */
    @Test
    public void testGetLivro() {
        System.out.println("getLivro");
        AlugarLivro instance = new AlugarLivro();
        Livros expResult = null;
        Livros result = instance.getLivro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLivro method, of class AlugarLivro.
     */
    @Test
    public void testSetLivro() {
        System.out.println("setLivro");
        Livros livro = null;
        AlugarLivro instance = new AlugarLivro();
        instance.setLivro(livro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatasaida method, of class AlugarLivro.
     */
    @Test
    public void testGetDatasaida() {
        System.out.println("getDatasaida");
        AlugarLivro instance = new AlugarLivro();
        Date expResult = null;
        Date result = instance.getDatasaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatasaida method, of class AlugarLivro.
     */
    @Test
    public void testSetDatasaida() {
        System.out.println("setDatasaida");
        Date datasaida = null;
        AlugarLivro instance = new AlugarLivro();
        instance.setDatasaida(datasaida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataretorno method, of class AlugarLivro.
     */
    @Test
    public void testGetDataretorno() {
        System.out.println("getDataretorno");
        AlugarLivro instance = new AlugarLivro();
        Date expResult = null;
        Date result = instance.getDataretorno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataretorno method, of class AlugarLivro.
     */
    @Test
    public void testSetDataretorno() {
        System.out.println("setDataretorno");
        Date dataretorno = null;
        AlugarLivro instance = new AlugarLivro();
        instance.setDataretorno(dataretorno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class AlugarLivro.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        AlugarLivro instance = new AlugarLivro();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class AlugarLivro.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        AlugarLivro instance = new AlugarLivro();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverLivro method, of class AlugarLivro.
     */
    @Test
    public void testDevolverLivro() {
        System.out.println("devolverLivro");
        AlugarLivro instance = new AlugarLivro();
        instance.devolverLivro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
