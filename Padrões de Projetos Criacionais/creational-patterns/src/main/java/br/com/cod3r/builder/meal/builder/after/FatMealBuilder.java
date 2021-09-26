package br.com.cod3r.builder.meal.builder.after;

public class FatMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Large Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Double Cheeseburger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Large Icecream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Hospital Pass");
    }
}
