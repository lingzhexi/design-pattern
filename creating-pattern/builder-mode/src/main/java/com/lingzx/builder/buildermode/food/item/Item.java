package com.lingzx.builder.buildermode.food.item;

import com.lingzx.builder.buildermode.food.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
