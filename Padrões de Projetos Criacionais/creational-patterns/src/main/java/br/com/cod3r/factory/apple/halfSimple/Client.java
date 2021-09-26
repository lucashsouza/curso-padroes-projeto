package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneXFactory genXFactory = new IPhoneXFactory();
		IPhone11Factory gen11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = genXFactory.orderIPhone("standard");
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iPhone2);
	}

}
