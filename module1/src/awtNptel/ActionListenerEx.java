package awtNptel;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerEx  implements ActionListener
{
    static  TextField tf;
	public static void main(String[] args) 
	{
		Frame f=new Frame("ActionListener Example");
	    tf=new TextField("welcome  to the textfield");
		tf.setBounds(50,50,150,20);
		Button b=new Button("click here");
		b.setBounds(50,100,60,30);
		
		//b.addActionListener(this);
		
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	

	}
	public void actionPerformed(ActionEvent e)
	{
		//tf.setText("Welcome here pratik");
	}

}
