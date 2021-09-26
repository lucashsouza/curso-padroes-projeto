package br.com.cod3r.builder.meal.builder.after;

import br.com.cod3r.builder.meal.builder.after.director.MealDirector;

public class Client {

	public static void order(String name, FastFoodMealBuilder builder) {

		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		System.out.println("------------------");
	}


	public static void main(String[] args) {
		order("Burguer Bacon", new Menu1Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Attack", new FatMealBuilder());
		order("Double Chicken", new Menu2Builder());
	}

}