package com.lingzx.builder.buildermode.food.meal;

import com.lingzx.builder.buildermode.food.item.burger.ChickenBurger;
import com.lingzx.builder.buildermode.food.item.burger.VegBurger;
import com.lingzx.builder.buildermode.food.item.drink.Coke;
import com.lingzx.builder.buildermode.food.item.drink.Pepsi;

public class MealBuidler {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
