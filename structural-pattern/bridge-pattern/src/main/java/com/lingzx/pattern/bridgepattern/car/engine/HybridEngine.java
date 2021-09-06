package com.lingzx.pattern.bridgepattern.car.engine;

public class HybridEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Hybird Engine");
    }
}
