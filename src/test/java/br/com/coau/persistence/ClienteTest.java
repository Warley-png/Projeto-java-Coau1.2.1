/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.persistence;

import java.util.List;
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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getIdcli method, of class Cliente.
     */
    @Test
    public void testGetIdcli() {
        System.out.println("getIdcli");
        Cliente instance = new Cliente();
        long expResult = 0L;
        long result = instance.getIdcli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcli method, of class Cliente.
     */
    @Test
    public void testSetIdcli() {
        System.out.println("setIdcli");
        long idcli = 0L;
        Cliente instance = new Cliente();
        instance.setIdcli(idcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomecli method, of class Cliente.
     */
    @Test
    public void testGetNomecli() {
        System.out.println("getNomecli");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNomecli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomecli method, of class Cliente.
     */
    @Test
    public void testSetNomecli() {
        System.out.println("setNomecli");
        String nomecli = "";
        Cliente instance = new Cliente();
        instance.setNomecli(nomecli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFonecli method, of class Cliente.
     */
    @Test
    public void testGetFonecli() {
        System.out.println("getFonecli");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getFonecli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFonecli method, of class Cliente.
     */
    @Test
    public void testSetFonecli() {
        System.out.println("setFonecli");
        String fonecli = "";
        Cliente instance = new Cliente();
        instance.setFonecli(fonecli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFacucli method, of class Cliente.
     */
    @Test
    public void testGetFacucli() {
        System.out.println("getFacucli");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getFacucli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFacucli method, of class Cliente.
     */
    @Test
    public void testSetFacucli() {
        System.out.println("setFacucli");
        String facucli = "";
        Cliente instance = new Cliente();
        instance.setFacucli(facucli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailcli method, of class Cliente.
     */
    @Test
    public void testGetEmailcli() {
        System.out.println("getEmailcli");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmailcli();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailcli method, of class Cliente.
     */
    @Test
    public void testSetEmailcli() {
        System.out.println("setEmailcli");
        String emailcli = "";
        Cliente instance = new Cliente();
        instance.setEmailcli(emailcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmprestimos method, of class Cliente.
     */
    @Test
    public void testGetEmprestimos() {
        System.out.println("getEmprestimos");
        Cliente instance = new Cliente();
        List<AlugarLivro> expResult = null;
        List<AlugarLivro> result = instance.getEmprestimos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmprestimos method, of class Cliente.
     */
    @Test
    public void testSetEmprestimos() {
        System.out.println("setEmprestimos");
        List<AlugarLivro> emprestimos = null;
        Cliente instance = new Cliente();
        instance.setEmprestimos(emprestimos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
