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
public class UsuarioClinicaTest {
    private UsuarioClinica clinica;
    public UsuarioClinicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        clinica = new UsuarioClinica();
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of setCnpj method, of class UsuarioClinica.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        clinica.setCnpj("Cnpj da Clinica");
        assertEquals("Cnpj da Clinica", clinica.getCnpj());
        System.out.println("O retorno do método é " + clinica.getCnpj());
    }
    
}
