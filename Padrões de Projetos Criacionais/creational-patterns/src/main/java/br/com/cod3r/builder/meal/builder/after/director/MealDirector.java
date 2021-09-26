package br.com.cod3r.builder.meal.builder.after.director;

import br.com.cod3r.builder.meal.builder.after.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.builder.after.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }

}
