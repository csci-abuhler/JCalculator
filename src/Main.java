import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	// Calculator frame dimensions.
	private final static int length = 500;
	private final static int height = 850;
	
	// Initializing the frame
	private static JFrame frame = new JFrame("CALCULATOR");

	private static void display() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
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
