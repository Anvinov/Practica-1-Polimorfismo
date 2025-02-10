package co.edu.unicauca.figures.domain.entities;

public class Square extends Figure{
    
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The side must be greater than zero");
        }
        
        this.side = side;
    }
    
    
}
