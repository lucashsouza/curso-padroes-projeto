package br.com.cod3r.prototype.functionalCloneBuilder;

import br.com.cod3r.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);


		User cloneUser = user.cloneBuilder().withName("Cloned++").getUser();
		System.out.println(cloneUser);

		User anotherUser = cloneUser.cloneBuilder()
				.withAge(100)
				.withAddress(new Address("Av. Paulista", 2300))
				.getUser();
		System.out.println(anotherUser);
	}
}