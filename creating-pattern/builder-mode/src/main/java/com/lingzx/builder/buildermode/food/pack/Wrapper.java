package com.lingzx.builder.buildermode.food.pack;

import com.lingzx.builder.buildermode.food.pack.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
