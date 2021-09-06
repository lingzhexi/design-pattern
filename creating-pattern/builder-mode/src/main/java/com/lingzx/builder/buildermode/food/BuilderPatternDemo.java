package com.lingzx.builder.buildermode.food;

import com.lingzx.builder.buildermode.food.meal.Meal;
import com.lingzx.builder.buildermode.food.meal.MealBuidler;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuidler buidler = new MealBuidler();
        System.out.println("====================================");
        Meal vegMeal = buidler.prepareNoVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        System.out.println("====================================");
        Meal noVegMeal = buidler.prepareVegMeal();
        System.out.println("NoVeg Meal");
        noVegMeal.showItems();
        System.out.println("Total Cost: "+noVegMeal.getCost());

    }
}
