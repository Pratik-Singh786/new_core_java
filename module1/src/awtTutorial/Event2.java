package awtTutorial;
import java.awt.*;
import java.awt.event.*;
public class Event2 extends Frame
{ 
	TextField tf1;
	
	Event2 ()
	{
		tf1=new TextField();
		Button b1=new Button("click here");
		tf1.setBounds(60,50,100,50);
		b1.setBounds(50,120,80,30);
		b1.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{  
			tf1.setText("hello");  
			}  
			});  
	
		add(b1);
		add(tf1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
		
	
	public static void main(String[] args) 
	{
	
       Event2 e3=new Event2();
	}

}
