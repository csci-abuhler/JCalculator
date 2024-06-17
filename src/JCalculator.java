import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JCalculator {
	// Calculator frame dimensions.
	private final static int length = 500;
	private final static int height = 650;

	// Initializing the frame
	private static JFrame frame = new JFrame("CALCULATOR");

	private static void display() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonInteraction buttonInteraction = new ButtonInteraction();

		// Setup the panel where the screen and buttons will be placed.
		JPanel displayPanel = new JPanel();
		frame.add(displayPanel);

		// Setup the screen panel and label where the numbers will appear.
		JPanel screenPanel = new JPanel();

		screenPanel.add(buttonInteraction.getScreen());

		JPanel userPanel = new JPanel();
		userPanel.setLayout(new GridLayout(1, 2));

		// Setup the button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		for (int i = 1; i < 10; i++) {
			buttonPanel.add(new JButton(Integer.toString(i)));
		} // for
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.zeroButtonPressed();
			} // action performed
		}); // action listener

		buttonPanel.add(zero);
		buttonPanel.add(new JButton("."));
		buttonPanel.add(new JButton("Enter"));

		// Setup the panel with arithmetic operations
		JPanel arithmeticPanel = new JPanel();
		arithmeticPanel.setLayout(new GridLayout(4, 0));

		JButton add = new JButton("+");
		arithmeticPanel.add(add);

		JButton subtract = new JButton("-");
		arithmeticPanel.add(subtract);

		JButton multiply = new JButton("*");
		arithmeticPanel.add(multiply);

		JButton divide = new JButton("/");
		arithmeticPanel.add(divide);

		// Set display panel layout
		displayPanel.setLayout(new GridLayout(2, 1));

		userPanel.add(buttonPanel);
		userPanel.add(arithmeticPanel);

		displayPanel.add(screenPanel);
		displayPanel.add(userPanel);

		// Adding some remaining essentials for the frame to function.
		frame.setPreferredSize(new Dimension(length, height));
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	} // display

	// Main method
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				display();
			} // run
		}); // SwingUtilities
	} // main method
} // class