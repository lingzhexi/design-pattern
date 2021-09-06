package com.lingzx.pattern.bridgepattern.car;

import com.lingzx.pattern.bridgepattern.car.engine.Engine;

/**
 * 修正抽象类
 */
public abstract class RefinedCar extends Car {

    public RefinedCar(Engine engine) {
        super(engine);
    }

    public void drive() {
        this.engine.start();
        System.out.println("Drive " + getBrand() + " car...");
    }

    public abstract String getBrand();
}
