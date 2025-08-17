/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package br.com.coau.persistence;

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
@Suite.SuiteClasses({br.com.coau.persistence.LivrosIMPLTest.class, br.com.coau.persistence.ClienteTest.class, br.com.coau.persistence.UsuarioTest.class, br.com.coau.persistence.UsuarioIMPLTest.class, br.com.coau.persistence.AlugarLivroTest.class, br.com.coau.persistence.LivrosDAOTest.class, br.com.coau.persistence.UsuarioDAOTest.class, br.com.coau.persistence.LivrosTest.class, br.com.coau.persistence.ClienteDAOTest.class, br.com.coau.persistence.JPAUtilTest.class, br.com.coau.persistence.ClienteIMPLTest.class})
public class PersistenceSuite {

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
