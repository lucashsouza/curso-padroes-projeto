package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OffState implements HeadphoneState {

    private static final HeadphoneState instance = new OffState();
    private OffState() {}

    @Override
    public void click(HeadPhone headPhone) {
        // Nothing to do
    }

    @Override
    public void longClick(HeadPhone headPhone) {
        headPhone.setOn(true);
        System.out.println("> Turning On");
        headPhone.setState(OnState.getInstance());
    }

    public static HeadphoneState getInstance(){
        return instance;
    }
}
