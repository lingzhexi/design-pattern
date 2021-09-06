package com.lingzx.builder.buildermode.food.item.burger;

import com.lingzx.builder.buildermode.food.item.Item;
import com.lingzx.builder.buildermode.food.pack.Packing;
import com.lingzx.builder.buildermode.food.pack.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract  float price() ;
}
