package com.lingzx.builder.buildermode.food.item.burger;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 25;
    }
}
