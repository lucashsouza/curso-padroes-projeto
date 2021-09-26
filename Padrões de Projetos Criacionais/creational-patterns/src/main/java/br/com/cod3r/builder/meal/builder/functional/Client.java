package br.com.cod3r.builder.meal.builder.functional;



public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .andMain("Burguer Bacon")
                .forDrink("Coke")
                .getMeal();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMeal.Builder("Fries")
                .getMeal();
        System.out.println(justFries);

        FastFoodMeal heartAttack = new FastFoodMeal.Builder("Large Fries")
                .andMain("Double Cheeseburger")
                .forDrink("Large Coke")
                .andDessert("Milkshake")
                .andGift("Hospital Pass")
                .getMeal();
        System.out.println(heartAttack);
    }

}
