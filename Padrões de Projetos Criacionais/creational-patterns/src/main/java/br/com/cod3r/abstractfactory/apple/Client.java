package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.*;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rulesBrazilian = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory rulesGermany = new GermanyRulesAbstractFactory();
		CountryRulesAbstractFactory rulesItalian = new ItalianRulesAbstractFactory();
		CountryRulesAbstractFactory rulesUS = new USRulesAbstractFactory();

		IPhoneFactory genXFactoryBrazilian = new IPhoneXFactory(rulesBrazilian);
		IPhoneFactory genXFactoryGermany = new IPhoneXFactory(rulesGermany);
		IPhoneFactory gen11FactoryItalian = new IPhone11Factory(rulesItalian);
		IPhoneFactory gen11FactoryUS = new IPhone11Factory(rulesUS);

		System.out.println("### Ordering an iPhone X Brazil \"");
		IPhone iPhoneXStandard = genXFactoryBrazilian.orderIPhone("standard");
		System.out.println(iPhoneXStandard);

		System.out.println("### Ordering an iPhone 11 United States\"");
		IPhone iPhone11Standard = gen11FactoryUS.orderIPhone("standard");
		System.out.println(iPhone11Standard);

		System.out.println("### Ordering an iPhone X Germany\"");
		IPhone iPhoneXHighEnd = genXFactoryGermany.orderIPhone("highEnd");
		System.out.println(iPhoneXHighEnd);

		System.out.println("### Ordering an iPhone X Italian\"");
		IPhone iPhone11HighEnd = gen11FactoryItalian.orderIPhone("highEnd");
		System.out.println(iPhone11HighEnd);
	}

}
