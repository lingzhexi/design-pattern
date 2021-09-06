package com.lingzx.mode.factorymethodmode.shape.factory;

import com.lingzx.mode.factorymethodmode.shape.Circle;
import com.lingzx.mode.factorymethodmode.shape.Rectangle;
import com.lingzx.mode.factorymethodmode.shape.Shape;
import com.lingzx.mode.factorymethodmode.shape.Square;

public class ShapeFactory {
    public Shape getShape(String type) {
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
