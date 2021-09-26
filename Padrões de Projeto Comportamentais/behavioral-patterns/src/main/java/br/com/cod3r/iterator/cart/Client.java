package br.com.cod3r.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

	public static void main(String[] args) {

		Cart cart = new Cart(
				new Product("TV", 1000.00),
				new Product("Shoe", 59.99),
				new Product("Pencil", 0.5));

		for (Product product : cart) {
			System.out.println(String.format(
					"%s = $%.2f", product.getDesc(), product.getValue()));
		}

		Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = stream.reduce(0.0,
				(acc, prod) -> acc + prod.getValue(), Double::sum);
		System.out.println("Total = $" + sum);

		Double sum2 = 0.0;
		for (Product prod: cart) {
			sum2 += prod.getValue();
		}
		System.out.println("Total = $" + sum2);
	}
}
