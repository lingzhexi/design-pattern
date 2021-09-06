package com.lingzx.pattern.bridgepattern.car;


import com.lingzx.pattern.bridgepattern.car.engine.Engine;

public abstract class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
