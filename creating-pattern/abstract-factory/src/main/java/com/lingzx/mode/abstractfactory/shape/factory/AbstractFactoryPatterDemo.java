package com.lingzx.mode.abstractfactory.shape.factory;

import com.lingzx.mode.abstractfactory.shape.AbstractFactory;
import com.lingzx.mode.abstractfactory.shape.color.Color;
import com.lingzx.mode.abstractfactory.shape.shape.Shape;

public class AbstractFactoryPatterDemo {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();

        AbstractFactory circleFactory = FactoryProducer.getFactory("circle");
        Color red = circleFactory.getColor("red");
        red.fill();

    }
}
