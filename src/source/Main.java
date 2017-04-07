package source;

import source.color.Color;
import source.color.enums.ColorType;
import source.factories.AbstractFactory;
import source.factories.FactoryProducer;
import source.factories.enums.FactoryType;
import source.shape.Shape;
import source.shape.ShapeType;

/**
 *
 * @author micha
 */
public class Main {

    /**
     * The running program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Inititalize Shape factory.
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();

        rectangle.draw();

        square.draw();

        // Initialize Color factory.
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);

        Color red = colorFactory.getColor(ColorType.RED);

        Color green = colorFactory.getColor(ColorType.GREEN);

        Color blue = colorFactory.getColor(ColorType.BLUE);
        
        red.fill();
        
        green.fill();
        
        blue.fill();

    }

}
