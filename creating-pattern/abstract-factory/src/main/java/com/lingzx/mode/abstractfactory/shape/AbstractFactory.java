package com.lingzx.mode.abstractfactory.shape;

import com.lingzx.mode.abstractfactory.shape.color.Color;
import com.lingzx.mode.abstractfactory.shape.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
