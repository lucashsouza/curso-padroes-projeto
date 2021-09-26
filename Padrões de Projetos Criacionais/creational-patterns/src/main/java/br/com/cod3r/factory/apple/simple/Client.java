package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iPhone2);
	}

}
