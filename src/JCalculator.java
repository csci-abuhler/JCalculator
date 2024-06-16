import java.awt.Dimension;
import java.awt.GridLayout;

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
		
		// Setup the panel where the screen and buttons will be placed. 
		JPanel displayPanel = new JPanel();
		frame.add(displayPanel);
		
		// Setup the screen panel and label where the numbers will appear.
		JPanel screenPanel = new JPanel();
		JLabel screen = new JLabel("Test");
		screenPanel.add(screen);
		
		JPanel userPanel = new JPanel();
		userPanel.setLayout(new GridLayout(1, 2));
		
		// Setup the button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		for (int i = 1; i < 10; i++) {
			buttonPanel.add(new JButton(Integer.toString(i)));
		} // for
		buttonPanel.add(new JButton("0"));
		buttonPanel.add(new JButton("."));
		buttonPanel.add(new JButton("Enter"));
		
		// Setup the panel with arithmetic operations
		JPanel arithmeticPanel = new JPanel();
		arithmeticPanel.setLayout(new GridLayout(4, 1));
		arithmeticPanel.add(new JButton("+"));
		arithmeticPanel.add(new JButton("-"));
		arithmeticPanel.add(new JButton("*"));
		arithmeticPanel.add(new JButton("/"));
		
		displayPanel.setLayout(new GridLayout(2, 1));
		
		userPanel.add(buttonPanel);
		userPanel.add(arithmeticPanel);
		
		displayPanel.add(screenPanel);
		displayPanel.add(userPanel);
		
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