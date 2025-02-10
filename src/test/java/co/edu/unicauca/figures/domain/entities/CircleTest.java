package co.edu.unicauca.figures.domain.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    
    public CircleTest() {
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
     * Test of class constructor, of class Circle.
     */
    @Test
    public void testConstructorWithNegativeRadius() {
        System.out.println("testConstructorWithNegativeRadius");
        try {
            Circle instance = new Circle(-5); // Se intenta crear un círculo con radio negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The radius cannot be negative", e.getMessage());
        }
    }
    
    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(7);
        double expResult = 153.938;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateAreaWithZeroRadius() {
        System.out.println("testCalculateAreaWithZeroRadius");
        Circle instance = new Circle(0);
        double expResult = 0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(7);
        double expResult = 43.982;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeterWithZeroRadius() {
        System.out.println("calculatePerimeterWithZeroRadius");
        Circle instance = new Circle(0);
        double expResult = 0;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Circle instance = new Circle(7);
        double expResult = 7;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 10;
        Circle instance = new Circle(7);
        instance.setRadius(radius);
    }
    
    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadiusToZero() {
        System.out.println("setRadius");
        double radius = 0;
        Circle instance = new Circle(7);
        instance.setRadius(radius);
    }
    
    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadiusToNegativeValue() {
        System.out.println("testSetRadiusToNegativeNumber");
        double radius = -5;
        Circle instance = new Circle(7);
        try {
            instance.setRadius(radius); // Se intenta cambiar el radio a negativo
            fail("An IllegalArgumentException was expected but was not thrown");
        } catch (IllegalArgumentException e) {
            // Prueba exitosa si se lanza la excepción
            assertEquals("The radius cannot be negative", e.getMessage());
        }
    }
}
