package swingTutorial;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExWithActionListner 
{

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Button example");
		final JTextField tf=new JTextField();
		tf.setBounds(50,50,100,20);
		JButton b=new JButton("click here");
		b.setBounds(50,100,90,30);
		b.addActionListener(new ActionListener()
				{
			     public void actionPerformed(ActionEvent e)
			     {
			    	 tf.setText("welcome to javatpoint");
			     }
			
				});
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	

	}

}
