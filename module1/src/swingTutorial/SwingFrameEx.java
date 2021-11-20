package swingTutorial;
import javax.swing.*;
import java.awt.*;
//import java.awt.FlowLayout;

public class SwingFrameEx {

	public static void main(String[] args) 
	{
		JFrame frame =new JFrame("J frame  example ");
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label =new JLabel("Jframe by example");
		JButton button=new JButton();
		button.setText("button");
		button.setBackground(Color.yellow);
		
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		frame.setSize(200,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	

	}

}
