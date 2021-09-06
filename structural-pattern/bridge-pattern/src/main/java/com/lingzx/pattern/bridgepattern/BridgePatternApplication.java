package com.lingzx.pattern.bridgepattern;

import com.lingzx.pattern.bridgepattern.car.RefinedCar;
import com.lingzx.pattern.bridgepattern.car.brand.BossCar;
import com.lingzx.pattern.bridgepattern.car.engine.HybridEngine;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgePatternApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BridgePatternApplication.class, args);
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }

}
