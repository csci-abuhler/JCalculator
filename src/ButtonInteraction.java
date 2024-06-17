import javax.swing.JLabel;

// Class made to simplify button interaction.
public class ButtonInteraction {
	private JLabel screen = new JLabel("");
	
	public JLabel getScreen() {
		return screen;
	} // get screen
	
	protected void zeroButtonPressed() {
		screen.setText("Test");
	} // zero button pressed
} // class
