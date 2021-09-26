package br.com.cod3r.builder.meal.builder.after;

public class Menu2Builder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Medium Fanta");
    }

    @Override
    public void buildMain() {
        meal.setMain("Double Chicken");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Cookies");
    }

}
