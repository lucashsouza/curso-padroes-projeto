package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class PlayingState implements HeadphoneState {

    private static final HeadphoneState instance = new PlayingState();
    private PlayingState() {}

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(false);
        System.out.println("> Stop Player");
        headPhone.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(false);
        System.out.println("> Turning Off");
        headPhone.setState(OffState.getInstance());
    }

    public static HeadphoneState getInstance() {
        return instance;
    }
}
