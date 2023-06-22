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
public class UsuarioClienteTest {
    private UsuarioCliente cliente;
    public UsuarioClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cliente = new UsuarioCliente();
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of setCpf method, of class UsuarioCliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        cliente.setCpf("623.350.743-00");
        assertEquals("623.350.743-00", cliente.getCpf());
        System.out.println("O retorno do método é " + cliente.getCpf());
    }

    /**
     * Test of setEmail method, of class UsuarioCliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        cliente.setEmail("julia.dantas62@aluno.ifce.edu.br");
        assertEquals("julia.dantas62@aluno.ifce.edu.br", cliente.getEmail());
        System.out.println("O retorno do método é " + cliente.getEmail());
    }
    
}
