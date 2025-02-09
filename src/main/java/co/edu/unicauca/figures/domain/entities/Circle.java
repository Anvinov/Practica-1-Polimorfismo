package co.edu.unicauca.figures.domain.entities;

/**
 *
 * @author Anderson Vinasco
 */
public class Circle extends Figure {
    
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("The radius cannot be negative");
        }
        
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("The radius cannot be negative");
        }
        
        this.radius = radius;
    }

}
