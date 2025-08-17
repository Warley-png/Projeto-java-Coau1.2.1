/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.persistence;

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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getIduser method, of class Usuario.
     */
    @Test
    public void testGetIduser() {
        System.out.println("getIduser");
        Usuario instance = new Usuario();
        Long expResult = null;
        Long result = instance.getIduser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIduser method, of class Usuario.
     */
    @Test
    public void testSetIduser() {
        System.out.println("setIduser");
        Long iduser = null;
        Usuario instance = new Usuario();
        instance.setIduser(iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String Usuario = "";
        Usuario instance = new Usuario();
        instance.setUsuario(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = new Usuario();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerfil method, of class Usuario.
     */
    @Test
    public void testGetPerfil() {
        System.out.println("getPerfil");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerfil method, of class Usuario.
     */
    @Test
    public void testSetPerfil() {
        System.out.println("setPerfil");
        String perfil = "";
        Usuario instance = new Usuario();
        instance.setPerfil(perfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
