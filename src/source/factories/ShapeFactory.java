/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.factories;

import source.color.Color;
import source.color.enums.ColorType;
import source.shape.Circle;
import source.shape.Rectangle;
import source.shape.Shape;
import source.shape.ShapeType;
import source.shape.Square;

/**
 *
 * @author micha
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * Return the shape according to the enum.
     *
     * @param shapeType which shape to return.
     * @return what the user decides.
     */
    public Shape getShape(ShapeType shapeType) {

        Shape shape = null;

        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;

            case SQUARE:
                shape = new Square();
                break;

            case RECTANGLE:
                shape = new Rectangle();
                break;

            default:
                System.out.println("No shape has been picked.");
                break;

        }

        return shape;
    }

    public Color getColor(ColorType colorType) {

        return null;

    }
}
