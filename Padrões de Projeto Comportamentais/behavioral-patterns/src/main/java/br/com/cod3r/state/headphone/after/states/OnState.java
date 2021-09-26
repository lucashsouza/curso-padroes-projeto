package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OnState implements HeadphoneState {

    private static final HeadphoneState instance = new OnState();
    private OnState() {}

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(true);
        System.out.println("> Resume Player");
        headPhone.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Turning off");
        headPhone.setState(PlayingState.getInstance());
    }

    public static HeadphoneState getInstance() {
        return instance;
    }
}
