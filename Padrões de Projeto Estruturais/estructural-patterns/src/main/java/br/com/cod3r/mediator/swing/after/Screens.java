package br.com.cod3r.mediator.swing.after;

import br.com.cod3r.mediator.swing.after.components.AddButton;
import br.com.cod3r.mediator.swing.after.components.Label;
import br.com.cod3r.mediator.swing.after.components.ResetButton;
import br.com.cod3r.mediator.swing.after.components.State;
import br.com.cod3r.mediator.swing.after.mediator.Mediator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Screens {
    private AddButton button;
    private ResetButton reset;
    private Label label;
    private State state;
    private Mediator mediator;

    public Screens() {
        mediator = new Mediator();
        button = new AddButton(mediator);
        reset = new ResetButton(mediator);
        label = new Label(mediator);
        mediator.setButton(button);
        mediator.setLabel(label);
        mediator.setState(state);
    }

    private void initButtonScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setTitle("Button's Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        frame.add(reset, BorderLayout.WEST);
        frame.add(button, BorderLayout.CENTER);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private void initCounterScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setTitle("Counter's Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
