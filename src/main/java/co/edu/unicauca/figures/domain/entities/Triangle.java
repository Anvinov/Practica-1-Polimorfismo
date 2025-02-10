package co.edu.unicauca.figures.domain.entities;

public class Triangle extends Figure {

    private double side_1, side_2, side_3;

    public Triangle(double side_1, double side_2, double side_3) {
        if (side_1 <= 0 || side_2 <= 0 || side_3 <= 0) {
            throw new IllegalArgumentException("The sides must be greater than zero");
        }
        
        if (side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 <= side_1) {
            throw new IllegalArgumentException("The sides do not form a valid triangle");
        }
        
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        
        return Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side_1 + side_2 + side_3;
    }

    public double getSide1() {
        return side_1;
    }

    public void setSide1(double side_1) {
        if (side_1 <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        
        if (side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 <= side_1) {
            throw new IllegalArgumentException("The new value affects the triangular inequality");
        }
        
        this.side_1 = side_1;
    }

    public double getSide2() {
        return side_2;
    }

    public void setSide2(double side_2) {
        if (side_2 <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        
        if (side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 <= side_1) {
            throw new IllegalArgumentException("The new value affects the triangular inequality");
        }
        
        this.side_2 = side_2;
    }

    public double getSide3() {
        return side_3;
    }

    public void setSide3(double side_3) {
        if (side_3 <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        
        if (side_1 + side_2 <= side_3 || side_1 + side_3 <= side_2 || side_2 + side_3 <= side_1) {
            throw new IllegalArgumentException("The new value affects the triangular inequality");
        }
         
        this.side_3 = side_3;
    }
    
    

}
