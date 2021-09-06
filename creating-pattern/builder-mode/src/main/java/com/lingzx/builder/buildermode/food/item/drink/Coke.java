package com.lingzx.builder.buildermode.food.item.drink;

public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10;
    }
}
