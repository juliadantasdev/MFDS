/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class UsuarioTest {
    private Usuario user;
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
        user = new Usuario();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        user.setNome("Sara");
        assertEquals("Sara", user.getNome());
        System.out.println("O retorno do método é " + user.getNome());
       
    }

    
    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        user.setTelefone("85991375875");
        assertEquals("85991375875", user.getTelefone());
        System.out.println("O retorno do método é " + user.getTelefone());
    }

    /**
     * Test of setEndereco method, of class Usuario.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        user.setEndereco("Treze de Maio");
        assertEquals("Treze de Maio", user.getEndereco());
        System.out.println("O retorno do método é " + user.getEndereco());
        
    }
    
}
