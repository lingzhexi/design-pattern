package com.lingzx.pattern.bridgepattern.car.brand;

import com.lingzx.pattern.bridgepattern.car.engine.Engine;
import com.lingzx.pattern.bridgepattern.car.RefinedCar;

public class BossCar extends RefinedCar {
    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Boss";
    }
}
