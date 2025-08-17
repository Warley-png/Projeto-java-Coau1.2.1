/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.coau.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class UsuarioIMPLTest {

    private EntityManager em;
    private UsuarioIMPL usuarioIMPL;

    @Before
    public void setUp() {
        // Cria um mock do EntityManager
        em = mock(EntityManager.class);
        usuarioIMPL = new UsuarioIMPL(em);
    }

    @After
    public void tearDown() {
       
    }

    
    @Test
    public void testValidarUsuario_Sucesso() {
        
        String login = "usuario";
        String senha = "senha";
        String perfilEsperado = "ADMIN";

        Query queryMock = mock(Query.class);
        when(em.createQuery(anyString())).thenReturn(queryMock);
        when(queryMock.setParameter("login", login)).thenReturn(queryMock);
        when(queryMock.setParameter("senha", senha)).thenReturn(queryMock);
        when(queryMock.getSingleResult()).thenReturn(perfilEsperado);

       
        String perfil = usuarioIMPL.validarUsuario(login, senha);

      
        assertEquals(perfilEsperado, perfil);
    }

    
    @Test
    public void testValidarUsuario_UsuarioInvalido() {
        // Arrange
        String login = "usuarioInvalido";
        String senha = "senhaInvalida";

        Query queryMock = mock(Query.class);
        when(em.createQuery(anyString())).thenReturn(queryMock);
        when(queryMock.setParameter("login", login)).thenReturn(queryMock);
        when(queryMock.setParameter("senha", senha)).thenReturn(queryMock);
        when(queryMock.getSingleResult()).thenThrow(new NoResultException());

        
        String perfil = usuarioIMPL.validarUsuario(login, senha);

        
        assertNull(perfil);
    }

    
}
