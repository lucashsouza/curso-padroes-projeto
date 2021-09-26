package br.com.cod3r.builder.meal.builder.fluent;

import br.com.cod3r.builder.meal.builder.fluent.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.builder.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .andMain("Burguer Bacon")
                .forDrink("Coke")
                .getMeal();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries")
                .getMeal();
        System.out.println(justFries);

        FastFoodMeal heartAttack = new FastFoodMealBuilder("Large Fries")
                .andMain("Double Cheeseburger")
                .forDrink("Large Coke")
                .andDessert("Milkshake")
                .andGift("Hospital Pass")
                .getMeal();
        System.out.println(heartAttack);
    }

}
