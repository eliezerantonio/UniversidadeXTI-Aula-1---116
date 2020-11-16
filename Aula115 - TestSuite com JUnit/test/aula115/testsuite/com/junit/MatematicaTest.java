/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula115.testsuite.com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliezer
 */
public class MatematicaTest {
    
    public MatematicaTest() {
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
     * Test of media method, of class Matematica.
     */
    @Test
    public void testMedia_double_double() {
        System.out.println("media");
        double x = 2;
        double y = 2;
        Matematica instance = new Matematica();
        double expResult = 2;
        double result = instance.media(x, y);
        assertEquals(2, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class Matematica.
     */
    @Test
    public void testMedia_String_String() {
        System.out.println("media");
        String x = "2";
        String y = "2";
        Matematica instance = new Matematica();
        double expResult = 2;
        double result = instance.media(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class Matematica.
     */
    @Test
    public void testMedia_doubleArr() {
        System.out.println("media");
        double[] numero = {5,5};
        Matematica instance = new Matematica();
        double expResult = 5;
        double result = instance.media(numero);
        assertEquals(expResult, 5, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of med method, of class Matematica.
     */
    @Test
    public void testMed() {
        System.out.println("med");
        double[] numero = {5,5};
        Matematica instance = new Matematica();
        double expResult = 2;
        double result = instance.med(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
