/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

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
        double x = 0.0;
        double y = 0.0;
        Matematica instance = new Matematica();
        double expResult = 0.0;
        double result = instance.media(x, y);
        assertEquals(1, instance.media(3, 3));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class Matematica.
     */
    @Test
    public void testMedia_String_String() {
        System.out.println("media");
        String x = "";
        String y = "";
        Matematica instance = new Matematica();
        double expResult = 0.0;
        double result = instance.media(x, y);
        assertEquals(1, instance.media("3", "3"));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class Matematica.
     */
    @Test
    public void testMedia_doubleArr() {
        System.out.println("media");
        double[] numero = null;
        Matematica instance = new Matematica();
        double expResult = 0.0;
        double result = instance.media(numero);
        assertEquals(1,instance.media(2,3));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of med method, of class Matematica.
     */
    @Test
    public void testMed() {
        System.out.println("med");
        double[] numero = null;
        Matematica instance = new Matematica();
        double expResult = 0.0;
        double result = instance.med(numero);
        assertEquals(10, instance.med(20,2));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
