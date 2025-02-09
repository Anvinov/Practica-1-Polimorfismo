package co.edu.unicauca.figures;

import co.edu.unicauca.figures.domain.entities.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson Vinasco
 */
public class Main {

    public static void main(String[] args) {
        
        Figure fig1 = new Circle(1);
        Figure fig2 = new Square(10);
        Figure fig3 = new Circle(2);
        Figure fig4 = new Triangle(9, 6, 5);

        List<Figure> figures = new ArrayList<>();
        
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        
        for(Figure fig: figures){
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
            System.out.println("");
        }

    }
}
