package br.com.cod3r.chain.billsDispenser.after;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		atm.withDraw(230);
		System.out.println("-----------");
		atm.withDraw(1589);
	}
}
