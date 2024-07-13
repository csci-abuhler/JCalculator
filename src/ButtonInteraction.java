import javax.swing.JLabel;

// Class made to simplify button interaction.
public class ButtonInteraction {
	String input = "";
	private JLabel screen = new JLabel(input);

	// Screen getter
	public JLabel getScreen() {
		return screen;
	} // get screen
	
	// Decimal button functionality
	protected void decimalButtonPressed() {
		// Check if the input is the empty string or already has a decimal in it. 
		if (input.equals("")) {
			input = "0.0";
		} else if (input.indexOf(".") == -1) {
			input += ".";
		} // if 
		screen.setText(input);
	} // Decimal button pressed
	
	// Zero button functionality
	protected void zeroButtonPressed() {
		input += "0";
		screen.setText(input);
	} // Zero button pressed

	// One button functionality
	protected void oneButtonPressed() {
		input += "1";
		screen.setText(input);
	} // One button pressed

	// Two button functionality
	protected void twoButtonPressed() {
		input += "2";
		screen.setText(input);
	} // Two button pressed

	// Three button functionality
	protected void threeButtonPressed() {
		input += "3";
		screen.setText(input);
	} // Three button pressed

	// Four button functionality
	protected void fourButtonPressed() {
		input += "4";
		screen.setText(input);
	} // Four button pressed

	// Five button functionality
	protected void fiveButtonPressed() {
		input += "5";
		screen.setText(input);
	} // Five button pressed

	// Six button functionality
	protected void sixButtonPressed() {
		input += "6";
		screen.setText(input);
	} // Six button pressed

	// Seven button functionality
	protected void sevenButtonPressed() {
		input += "7";
		screen.setText(input);
	} // Seven button pressed

	// Eight button functionality
	protected void eightButtonPressed() {
		input += "8";
		screen.setText(input);
	} // Eight button pressed

	// Nine button functionality
	protected void nineButtonPressed() {
		input += "9";
		screen.setText(input);
	} // Nine button pressed

	// Clear button functionality
	protected void clearButtonPressed() {
		input = "";
		screen.setText(input);
	} // Clear button pressed
} // class
