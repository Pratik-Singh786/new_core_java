package swingTutorial;
import java.awt.*;
import javax.swing.*;
public class PanelEx {

	public static void main(String[] args) 
	{
		 JFrame  frame =new  JFrame("Panel Example");
		 JPanel panel =new JPanel();
		 panel.setBounds(40,80,200,200);
		 panel.setBackground(Color.GRAY);
		 JButton b1=new JButton("Button 1");
		 b1.setBounds(80,100,80,50);
		 b1.setBackground(Color.yellow);
		 JButton b2=new JButton("Button 2");
		 b2.setBounds(100,100,80,50);
		 b2.setBackground(Color.green);
		 panel.add(b1);
		 panel.add(b2);
		 frame.add(panel);
		 frame.setSize(400,400);
		 frame.setLayout(null);
		 frame.setVisible(true);
		 
		 
		 
		

	}

}
