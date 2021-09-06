package com.lingzx.mode.abstractfactory.shape.shape.factory;

import com.lingzx.mode.abstractfactory.shape.AbstractFactory;
import com.lingzx.mode.abstractfactory.shape.color.Color;
import com.lingzx.mode.abstractfactory.shape.shape.Circle;
import com.lingzx.mode.abstractfactory.shape.shape.Rectangle;
import com.lingzx.mode.abstractfactory.shape.shape.Shape;
import com.lingzx.mode.abstractfactory.shape.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String type){
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
