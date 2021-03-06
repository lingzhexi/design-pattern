package com.lingzx.builder.buildermode.food.meal;

import com.lingzx.builder.buildermode.food.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("  ITEM: "+item.name());
            System.out.println("  PACKING: "+item.packing().pack());
            System.out.println("  PRICE: "+item.price());

        }
    }


}
