/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Warley
 */
public class LivrosIMPLTest {

    private EntityManager em;
    private LivrosIMPL livrosIMPL;
    private EntityTransaction transaction;

    public LivrosIMPLTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        em = mock(EntityManager.class);
        transaction = mock(EntityTransaction.class);
        when(em.getTransaction()).thenReturn(transaction);

        livrosIMPL = new LivrosIMPL(em);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarLivro method, of class LivrosIMPL.
     */
    @Test
    public void testCadastrarLivro() {
        System.out.println("cadastrarLivro");
        Livros livro = new Livros();
        livro.setNomeliv("Livro Teste");
        livro.setAutorliv("teste Autor");
        livro.setAssuntoliv("teste assunto");
        livro.setEditoraliv("teste editora");
        livro.setAno("2025");
        livro.setVolumerev("1");
        livro.setPrateleiraliv("prateleira teste");
        livro.setTipo("teste");
        livrosIMPL.cadastrarLivro(livro);

        verify(em).persist(livro); // Verifica se o método persist foi chamado com o objeto livro

    }

    /**
     * Test of listarLivros method, of class LivrosIMPL.
     */
    @Test
    public void testListarLivros() {
        List<Livros> listalivros = new ArrayList<>();
        Livros livro1 = new Livros();
        livro1.setNomeliv("livro teste");
        Livros livro2 = new Livros();
        livro2.setNomeliv("teste livro2");
        listalivros.add(livro1);

        listalivros.add(livro2);

        Query queryMock = mock(Query.class);
        when(em.createQuery(anyString())).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(listalivros);
        List<Livros> listaLivrosRetornada = livrosIMPL.listarLivros();
        assertEquals(listalivros, listaLivrosRetornada);
    }

}
