package br.com.cod3r.observer.party.after.observers;

public class Wife implements Observer {

    @Override
    public void update(boolean status) {
        if (status) {
            partyTime();
        } else {
            System.out.println("Hold!");
        }
    }

    public void partyTime() {
        System.out.println("Let's Party! :D");
    }
}
