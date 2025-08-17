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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
     * Test of adicionarClientes method, of class ClienteDAO.
     */
    @Test
    public void testAdicionarClientes() {
        System.out.println("adicionarClientes");
        Cliente c = null;
        ClienteDAO instance = new ClienteDAOImpl();
        instance.adicionarClientes(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientes method, of class ClienteDAO.
     */
    @Test
    public void testListarClientes() {
        System.out.println("listarClientes");
        ClienteDAO instance = new ClienteDAOImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarClientes method, of class ClienteDAO.
     */
    @Test
    public void testPesquisarClientes() {
        System.out.println("pesquisarClientes");
        String filtro = "";
        ClienteDAO instance = new ClienteDAOImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.pesquisarClientes(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarCliente method, of class ClienteDAO.
     */
    @Test
    public void testEditarCliente() {
        System.out.println("editarCliente");
        String nomecli = "";
        String fonecli = "";
        String facucli = "";
        String emailcli = "";
        long idcli = 0L;
        ClienteDAO instance = new ClienteDAOImpl();
        instance.editarCliente(nomecli, fonecli, facucli, emailcli, idcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirCliente method, of class ClienteDAO.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        long idcli = 0L;
        ClienteDAO instance = new ClienteDAOImpl();
        instance.excluirCliente(idcli);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of temEmprestimosAtivos method, of class ClienteDAO.
     */
    @Test
    public void testTemEmprestimosAtivos() {
        System.out.println("temEmprestimosAtivos");
        long clienteId = 0L;
        ClienteDAO instance = new ClienteDAOImpl();
        boolean expResult = false;
        boolean result = instance.temEmprestimosAtivos(clienteId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClientePorId method, of class ClienteDAO.
     */
    @Test
    public void testBuscarClientePorId() {
        System.out.println("buscarClientePorId");
        long idcli = 0L;
        ClienteDAO instance = new ClienteDAOImpl();
        Cliente expResult = null;
        Cliente result = instance.buscarClientePorId(idcli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ClienteDAOImpl implements ClienteDAO {

        public void adicionarClientes(Cliente c) {
        }

        public List<Cliente> listarClientes() {
            return null;
        }

        public List<Cliente> pesquisarClientes(String filtro) {
            return null;
        }

        public void editarCliente(String nomecli, String fonecli, String facucli, String emailcli, long idcli) {
        }

        public void excluirCliente(long idcli) {
        }

        public boolean temEmprestimosAtivos(long clienteId) {
            return false;
        }

        public Cliente buscarClientePorId(long idcli) {
            return null;
        }
    }
    
}
