package br.com.cod3r.state.headphone.after;

import br.com.cod3r.state.headphone.after.states.HeadphoneState;
import br.com.cod3r.state.headphone.after.states.OffState;

public class HeadPhone {
	private HeadphoneState state;
	private boolean isOn;
	private boolean isPlaying;
	
	public HeadPhone() {
		this.isOn = false;
		this.isPlaying = false;
		state = OffState.getInstance();
	}
	
	public void onLongClick() {
		System.out.println("Long Click Pressed...");
		state.longClick(this);
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		state.click(this);
	}

	public HeadphoneState getState() {
		return state;
	}

	public void setState(HeadphoneState state) {
		this.state = state;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean on) {
		isOn = on;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean playing) {
		isPlaying = playing;
	}
}
