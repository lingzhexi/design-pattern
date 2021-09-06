package com.lingzx.builder.buildermode.food.item.drink;

import com.lingzx.builder.buildermode.food.item.Item;
import com.lingzx.builder.buildermode.food.pack.Bottle;
import com.lingzx.builder.buildermode.food.pack.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
