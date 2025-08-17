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
public class LivrosDAOTest {
    
    public LivrosDAOTest() {
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
     * Test of cadastrarLivro method, of class LivrosDAO.
     */
    @Test
    public void testCadastrarLivro() {
        System.out.println("cadastrarLivro");
        Livros livro = null;
        LivrosDAO instance = new LivrosDAOImpl();
        instance.cadastrarLivro(livro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLivros method, of class LivrosDAO.
     */
    @Test
    public void testListarLivros() {
        System.out.println("listarLivros");
        LivrosDAO instance = new LivrosDAOImpl();
        List<Livros> expResult = null;
        List<Livros> result = instance.listarLivros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarLivros method, of class LivrosDAO.
     */
    @Test
    public void testPesquisarLivros() {
        System.out.println("pesquisarLivros");
        String filtro = "";
        LivrosDAO instance = new LivrosDAOImpl();
        List<Livros> expResult = null;
        List<Livros> result = instance.pesquisarLivros(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarLivro method, of class LivrosDAO.
     */
    @Test
    public void testEditarLivro() {
        System.out.println("editarLivro");
        String nomeliv = "";
        String autorliv = "";
        String assuntoliv = "";
        String editoraliv = "";
        String anorev = "";
        String volumerev = "";
        String prateleira = "";
        String tipo = "";
        long idliv = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        instance.editarLivro(nomeliv, autorliv, assuntoliv, editoraliv, anorev, volumerev, prateleira, tipo, idliv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirlivro method, of class LivrosDAO.
     */
    @Test
    public void testExcluirlivro() {
        System.out.println("excluirlivro");
        long idliv = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        instance.excluirlivro(idliv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EmprestimosAtivos method, of class LivrosDAO.
     */
    @Test
    public void testEmprestimosAtivos() {
        System.out.println("EmprestimosAtivos");
        long idliv = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        boolean expResult = false;
        boolean result = instance.EmprestimosAtivos(idliv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLivroPorId method, of class LivrosDAO.
     */
    @Test
    public void testBuscarLivroPorId() {
        System.out.println("buscarLivroPorId");
        long idliv = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        Livros expResult = null;
        Livros result = instance.buscarLivroPorId(idliv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alugarLivro method, of class LivrosDAO.
     */
    @Test
    public void testAlugarLivro() {
        System.out.println("alugarLivro");
        long clienteId = 0L;
        long livroId = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        boolean expResult = false;
        boolean result = instance.alugarLivro(clienteId, livroId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverLivro method, of class LivrosDAO.
     */
    @Test
    public void testDevolverLivro() {
        System.out.println("devolverLivro");
        long livroId = 0L;
        LivrosDAO instance = new LivrosDAOImpl();
        boolean expResult = false;
        boolean result = instance.devolverLivro(livroId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEmprestimos method, of class LivrosDAO.
     */
    @Test
    public void testListarEmprestimos() {
        System.out.println("listarEmprestimos");
        LivrosDAO instance = new LivrosDAOImpl();
        List<AlugarLivro> expResult = null;
        List<AlugarLivro> result = instance.listarEmprestimos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarEmprestimo method, of class LivrosDAO.
     */
    @Test
    public void testPesquisarEmprestimo() {
        System.out.println("pesquisarEmprestimo");
        String filtro = "";
        LivrosDAO instance = new LivrosDAOImpl();
        List<AlugarLivro> expResult = null;
        List<AlugarLivro> result = instance.pesquisarEmprestimo(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisarlivros method, of class LivrosDAO.
     */
    @Test
    public void testPesquisarlivros() {
        System.out.println("pesquisarlivros");
        String prateleiraliv = "";
        LivrosDAO instance = new LivrosDAOImpl();
        List<Livros> expResult = null;
        List<Livros> result = instance.pesquisarlivros(prateleiraliv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prateleiracad method, of class LivrosDAO.
     */
    @Test
    public void testPrateleiracad() {
        System.out.println("prateleiracad");
        String prateleiraliv = "";
        LivrosDAO instance = new LivrosDAOImpl();
        boolean expResult = false;
        boolean result = instance.prateleiracad(prateleiraliv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LivrosDAOImpl implements LivrosDAO {

        public void cadastrarLivro(Livros livro) {
        }

        public List<Livros> listarLivros() {
            return null;
        }

        public List<Livros> pesquisarLivros(String filtro) {
            return null;
        }

        public void editarLivro(String nomeliv, String autorliv, String assuntoliv, String editoraliv, String anorev, String volumerev, String prateleira, String tipo, long idliv) {
        }

        public void excluirlivro(long idliv) {
        }

        public boolean EmprestimosAtivos(long idliv) {
            return false;
        }

        public Livros buscarLivroPorId(long idliv) {
            return null;
        }

        public boolean alugarLivro(long clienteId, long livroId) {
            return false;
        }

        public boolean devolverLivro(long livroId) {
            return false;
        }

        public List<AlugarLivro> listarEmprestimos() {
            return null;
        }

        public List<AlugarLivro> pesquisarEmprestimo(String filtro) {
            return null;
        }

        public List<Livros> pesquisarlivros(String prateleiraliv) {
            return null;
        }

        public boolean prateleiracad(String prateleiraliv) {
            return false;
        }
    }
    
}
