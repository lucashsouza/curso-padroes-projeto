package br.com.cod3r.builder.meal.builder.after;

public class Menu1Builder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Large Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Burguer Bacon");
    }

    @Override
    public void buildSide() {
        meal.setSide("Medium Fries");
    }

}
