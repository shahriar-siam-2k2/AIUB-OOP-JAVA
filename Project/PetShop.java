import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetShop extends JWindow 
{
	JLabel userLabel,imgLabel;
	JPanel panel;
	Color myColor;
	Font myFont;
	ImageIcon img;
	
	public PetShop()
	{
		myColor = new Color(210, 230, 135);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		
		
		
		img = new ImageIcon("PSPIC.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0, 564,564);
		
		panel.add(imgLabel);
		
		this.add(panel);
		setSize(564,564);
		
		this.setLocation(400,180);
		
		
		
	}
	
	
	
		
	
		
	
}