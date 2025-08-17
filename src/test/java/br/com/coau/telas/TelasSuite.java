/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package br.com.coau.telas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Warley
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.com.coau.telas.TelaCadastroUsuarioTest.class, br.com.coau.telas.TelaClienteTest.class, br.com.coau.telas.TelaCadastroLivrosTest.class, br.com.coau.telas.TelaAlugarLivroTest.class, br.com.coau.telas.TelaPrincipalTest.class, br.com.coau.telas.TelaListadeLivroEmprestadosTest.class, br.com.coau.telas.TelaListaLivrosTest.class, br.com.coau.telas.TelaLoginTest.class})
public class TelasSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
