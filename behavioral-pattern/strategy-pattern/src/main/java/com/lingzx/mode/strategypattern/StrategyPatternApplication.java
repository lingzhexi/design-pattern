package com.lingzx.mode.strategypattern;

import com.lingzx.mode.strategypattern.strategy.Add;
import com.lingzx.mode.strategypattern.strategy.Context;
import com.lingzx.mode.strategypattern.strategy.Multiply;
import com.lingzx.mode.strategypattern.strategy.Subtract;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {

    public static void main(String[] args) {
        Context context = new Context(new Add());
        Context sub = new Context(new Subtract());
        Context multiply = new Context(new Multiply());
        System.out.println((context.execute(1, 3)));
        System.out.println(sub.execute(1, 3));
        System.out.println(multiply.execute(1, 3));
    }

}
