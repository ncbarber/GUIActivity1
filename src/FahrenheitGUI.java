import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitGUI 
{
	private int WIDTH = 300;
	private int LENGTH = 75;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	
	public FahrenheitGUI()
	{
		frame = new JFrame ("Temperature Conversion");
	}
}
