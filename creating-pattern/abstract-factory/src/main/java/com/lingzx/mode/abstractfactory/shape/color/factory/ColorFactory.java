package com.lingzx.mode.abstractfactory.shape.color.factory;

import com.lingzx.mode.abstractfactory.shape.AbstractFactory;
import com.lingzx.mode.abstractfactory.shape.color.Blue;
import com.lingzx.mode.abstractfactory.shape.color.Color;
import com.lingzx.mode.abstractfactory.shape.color.Green;
import com.lingzx.mode.abstractfactory.shape.color.Red;
import com.lingzx.mode.abstractfactory.shape.shape.Shape;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
