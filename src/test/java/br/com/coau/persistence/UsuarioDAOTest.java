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
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
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
     * Test of validarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
        String login = "";
        String senha = "";
        UsuarioDAO instance = new UsuarioDAOImpl();
        String expResult = "";
        String result = instance.validarUsuario(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testConsultarUsuario() {
        System.out.println("consultarUsuario");
        long iduser = 0L;
        UsuarioDAO instance = new UsuarioDAOImpl();
        Usuario expResult = null;
        Usuario result = instance.consultarUsuario(iduser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testCadastrarUsuario() {
        System.out.println("cadastrarUsuario");
        Usuario u = null;
        UsuarioDAO instance = new UsuarioDAOImpl();
        instance.cadastrarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testEditarUsuario() {
        System.out.println("editarUsuario");
        Usuario u = null;
        UsuarioDAO instance = new UsuarioDAOImpl();
        instance.editarUsuario(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testRemoverUsuario() {
        System.out.println("removerUsuario");
        long iduser = 0L;
        UsuarioDAO instance = new UsuarioDAOImpl();
        instance.removerUsuario(iduser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsuarioDAOImpl implements UsuarioDAO {

        public String validarUsuario(String login, String senha) {
            return "";
        }

        public Usuario consultarUsuario(long iduser) {
            return null;
        }

        public void cadastrarUsuario(Usuario u) {
        }

        public void editarUsuario(Usuario u) {
        }

        public void removerUsuario(long iduser) {
        }
    }
    
}
