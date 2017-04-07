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

import source.factories.enums.FactoryType;

/**
 *
 * @author micha
 */
public class FactoryProducer {

    /**
     * Return the choosen Factory.
     *
     * @param factoryType factory to return.
     * @return the choosen factory.
     */
    public static AbstractFactory getFactory(FactoryType factoryType) {

        AbstractFactory abstractFactory = null;

        switch (factoryType) {
            case SHAPE:
                abstractFactory = new ShapeFactory();
                break;

            case COLOR:
                abstractFactory = new ColorFactory();
                break;
        }

        return abstractFactory;

    }

}
