import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
			// buttonPanel.add(new JButton(Integer.toString(i)));
		} // for

		// One button created and functionality made.
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.oneButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(one);

		// Two button created and functionality made.
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.twoButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(two);

		// Three button created and functionality made.
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.threeButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(three);

		// Four button created and functionality made.
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.fourButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(four);

		// Five button created and functionality made.
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.fiveButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(five);

		// Six button created and functionality made.
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.sixButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(six);

		// Seven button created and functionality made.
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.sevenButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(seven);

		// Eight button created and functionality made.
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.eightButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(eight);

		// Nine button created and functionality made.
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.nineButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(nine);

		// Zero button created and functionality made.
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.zeroButtonPressed();
			} // action performed
		}); // action listener
		buttonPanel.add(zero);

		// Extra buttons
		buttonPanel.add(new JButton("."));
		buttonPanel.add(new JButton("Enter"));
		JButton clear = new JButton("Clear");

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

		// Clear button created and functionality made.
		arithmeticPanel.add(clear);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonInteraction.clearButtonPressed();
			} // action performed
		}); // action listener
		
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