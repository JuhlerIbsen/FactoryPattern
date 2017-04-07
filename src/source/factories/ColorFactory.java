/*
 * Copyright (C) 2017 micha
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package source.factories;

import source.color.Blue;
import source.color.Color;
import source.color.Green;
import source.color.Red;
import source.color.enums.ColorType;
import source.shape.Shape;
import source.shape.ShapeType;

/**
 *
 * @author micha
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }

    /**
     * Return the color according to the enum.
     *
     * @param colorType which color to return.
     * @return what the user decides.
     */
    @Override
    public Color getColor(ColorType colorType) {

        Color color = null;

        switch (colorType) {
            case RED:
                color = new Red();
                break;

            case GREEN:
                color = new Green();
                break;

            case BLUE:
                color = new Blue();
                break;

        }

        return color;

    }

}
