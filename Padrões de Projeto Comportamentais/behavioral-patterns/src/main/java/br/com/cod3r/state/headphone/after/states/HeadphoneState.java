package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public interface HeadphoneState {
    void click(HeadPhone headPhone);
    void longClick(HeadPhone headPhone);
}
