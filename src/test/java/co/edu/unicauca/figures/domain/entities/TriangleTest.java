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
public class TriangleTest {
    
    public TriangleTest() {
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
            Triangle instance = new Triangle(-5, -5, 2); // Se intenta crear un triangulo con lados negativos
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The sides must be greater than zero", e.getMessage());
        }
    }
    
    /**
     * Test of class constructor, of class Square.
     */
    @Test
    public void testConstructorWithWrongSides() {
        System.out.println("testConstructorWithWrongSides");
        try {
            Triangle instance = new Triangle(5, 40, 2); // Se intenta crear un triangulo con lados negativos
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The sides do not form a valid triangle", e.getMessage());
        }
    }
    
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(5, 4, 2);
        double expResult = 3.799;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(5, 7, 4);
        double expResult = 16;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getSide1 method, of class Triangle.
     */
    @Test
    public void testGetSide1() {
        System.out.println("getSide1");
        Triangle instance = new Triangle(5, 6, 2);
        double expResult = 5;
        double result = instance.getSide1();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide1() {
        System.out.println("setSide1");
        double side1 = 9;
        Triangle instance = new Triangle(5, 8, 5);
        instance.setSide1(side1);
    }
    
    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide1ToNegativeValue() {
        System.out.println("testSetSide1ToNegativeValue");
        double side1 = -9;
        Triangle instance = new Triangle(5, 5, 2);
        try {
            instance.setSide1(side1); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The side must be greater than zero", e.getMessage());
        }
    }
    
    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide1ToWrongValue() {
        System.out.println("testSetSide1ToWrongValue");
        double side1 = 90;
        Triangle instance = new Triangle(5, 5, 2);
        try {
            instance.setSide1(side1); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The new value affects the triangular inequality", e.getMessage());
        }
    }

    /**
     * Test of getSide2 method, of class Triangle.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        Triangle instance = new Triangle(5, 7, 3);
        double expResult = 7;
        double result = instance.getSide2();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2() {
        System.out.println("setSide2");
        double side2 = 8;
        Triangle instance = new Triangle(5, 6, 4);
        instance.setSide2(side2);
    }
    
    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2ToNegativeValue() {
        System.out.println("testSetSide2ToNegativeValue");
        double side2 = -3;
        Triangle instance = new Triangle(5, 5, 2);
        try {
            instance.setSide2(side2); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The side must be greater than zero", e.getMessage());
        }
    }
    
    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide2ToWrongValue() {
        System.out.println("testSetSide2ToWrongValue");
        double side2 = 90;
        Triangle instance = new Triangle(5, 5, 2);
        try {
            instance.setSide2(side2); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The new value affects the triangular inequality", e.getMessage());
        }
    }

    /**
     * Test of getSide3 method, of class Triangle.
     */
    @Test
    public void testGetSide3() {
        System.out.println("getSide3");
        Triangle instance = new Triangle(5, 4, 2);
        double expResult = 2;
        double result = instance.getSide3();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSide3 method, of class Triangle.
     */
    @Test
    public void testSetSide3() {
        System.out.println("setSide3");
        double side3 = 4;
        Triangle instance = new Triangle(5, 4, 2);
        instance.setSide3(side3);
    }
    
    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide3ToNegativeValue() {
        System.out.println("testSetSide3ToNegativeValue");
        double side3 = -9;
        Triangle instance = new Triangle(5, 6, 2);
        try {
            instance.setSide3(side3); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The side must be greater than zero", e.getMessage());
        }
    }
    
    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide3ToWrongValue() {
        System.out.println("testSetSide3ToWrongValue");
        double side3 = 90;
        Triangle instance = new Triangle(5, 5, 2);
        try {
            instance.setSide3(side3); // Se intenta cambiar el valor del lado a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The new value affects the triangular inequality", e.getMessage());
        }
    }
}
