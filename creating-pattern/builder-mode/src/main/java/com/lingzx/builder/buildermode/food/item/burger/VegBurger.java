package com.lingzx.builder.buildermode.food.item.burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 20;
    }
}
