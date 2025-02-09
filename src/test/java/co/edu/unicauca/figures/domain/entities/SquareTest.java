package co.edu.unicauca.figures.domain.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anderson Vinasco
 */
public class SquareTest {
    
    public SquareTest() {
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
     * Test of class constructor, of class Square.
     */

    @Test
    public void testConstructorWithNegativeSide() {
        System.out.println("testConstructorWithNegativeSide");
        try {
            Square instance = new Square(-5); // Se intenta crear un cuadrado con lado negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The side must be greater than zero", e.getMessage());
        }
    }
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Square instance = new Square(8);
        double expResult = 64;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(8);
        double expResult = 32;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getSide method, of class Square.
     */
    @Test
    public void testGetSide() {
        System.out.println("getSide");
        Square instance = new Square(8);
        double expResult = 8;
        double result = instance.getSide();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSide method, of class Square.
     */
    @Test
    public void testSetSide() {
        System.out.println("setSide");
        double side = 7;
        Square instance = new Square(8);
        instance.setSide(side);
    }
    
    /**
     * Test of setSide method, of class Square.
     */
    @Test
    public void testSetSideToNegativeValue() {
        System.out.println("testSetSideToNegativeNumber");
        double side = -5;
        Square instance = new Square(8);
        try {
            instance.setSide(side);// Se intenta cambiar el lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The side must be greater than zero", e.getMessage());
        }
    }
}
