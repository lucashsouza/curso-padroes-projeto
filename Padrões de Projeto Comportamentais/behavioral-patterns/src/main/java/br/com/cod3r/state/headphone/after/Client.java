package br.com.cod3r.state.headphone.after;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class Client {

	public static void main(String[] args) {
		HeadPhone phone = new HeadPhone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}
}
