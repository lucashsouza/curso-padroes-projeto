package br.com.cod3r.observer.swing;

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
		Label labelButton1 = new Label("Button 1");
		Label labelButton1And2 = new Label("Button 1/2");
		Label labelButton2 = new Label("Button 2");

		labelPanel.add(labelButton1);
		labelPanel.add(labelButton1And2);
		labelPanel.add(labelButton2);

		frame.add(labelPanel, BorderLayout.CENTER);

		Button button1 = new Button("Button #1", labelButton1, labelButton1And2);
		Button button2 = new Button("Button #2", labelButton1And2, labelButton2);

		frame.add(button1, BorderLayout.WEST);
		frame.add(button2, BorderLayout.EAST);

		frame.setSize(800, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
