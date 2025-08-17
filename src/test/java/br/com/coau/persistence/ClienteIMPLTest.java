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
public class ClienteIMPLTest {
    
    public ClienteIMPLTest() {
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
     * Test of adicionarClientes method, of class ClienteIMPL.
     */
    @Test
    public void testAdicionarClientes() {
        System.out.println("adicionarClientes");
        Cliente c = null;
        ClienteIMPL instance = null;
        instance.adicionarClientes(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientes method, of class ClienteIMPL.
     */
    @Test
    public void testListarClientes() {
        System.out.println("listarClientes");
        ClienteIMPL instance = null;
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarClientes method, of class ClienteIMPL.
     */
    @Test
    public void testPesquisarClientes() {
        System.out.println("pesquisarClientes");
        String filtro = "";
        ClienteIMPL instance = null;
        List<Cliente> expResult = null;
        List<Cliente> result = instance.pesquisarClientes(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarCliente method, of class ClienteIMPL.
     */
    @Test
    public void testEditarCliente() {
        System.out.println("editarCliente");
        String nomecli = "";
        String fonecli = "";
        String facucli = "";
        String emailcli = "";
        long idcli = 0L;
        ClienteIMPL instance = null;
        instance.editarCliente(nomecli, fonecli, facucli, emailcli, idcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirCliente method, of class ClienteIMPL.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        long idcli = 0L;
        ClienteIMPL instance = null;
        instance.excluirCliente(idcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temEmprestimosAtivos method, of class ClienteIMPL.
     */
    @Test
    public void testTemEmprestimosAtivos() {
        System.out.println("temEmprestimosAtivos");
        long clienteId = 0L;
        ClienteIMPL instance = null;
        boolean expResult = false;
        boolean result = instance.temEmprestimosAtivos(clienteId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClientePorId method, of class ClienteIMPL.
     */
    @Test
    public void testBuscarClientePorId() {
        System.out.println("buscarClientePorId");
        long idcli = 0L;
        ClienteIMPL instance = null;
        Cliente expResult = null;
        Cliente result = instance.buscarClientePorId(idcli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
