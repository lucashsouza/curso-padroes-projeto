package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone11ProFactory iPhone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iPhoneXFactory.orderIPhone();
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iPhone11ProFactory.orderIPhone();
		System.out.println(iphone2);

	}
}
