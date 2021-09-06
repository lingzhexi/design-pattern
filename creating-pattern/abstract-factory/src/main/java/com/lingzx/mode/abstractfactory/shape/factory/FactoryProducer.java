package com.lingzx.mode.abstractfactory.shape.factory;

import com.lingzx.mode.abstractfactory.shape.AbstractFactory;
import com.lingzx.mode.abstractfactory.shape.color.factory.ColorFactory;
import com.lingzx.mode.abstractfactory.shape.shape.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
