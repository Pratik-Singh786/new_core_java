package awtTutorial;
import java.awt.*;
import java.awt.event.*;
public class AwtButtonAl {

	public static void main(String[] args) 
	{
		 Frame f=new Frame("Button example");
		 TextField td=new TextField();
		 td.setBounds(50,50,100,50);
		 Button bt=new Button("Click here");
		 bt.setBounds(50,100,60,30);
		 bt.addActionListener(new ActionListener()
				 {
			        public void actionPerformed(ActionEvent e)
			        {
			        	for(int i=0;i<10;i++)
			        			 {
			        	td.setText("Welocme to  my world");
			        			 }
			        }
			 
				 });
		 f.add(bt);
		 f.add(td);
		 f.setLayout(null);
		 f.setVisible(true);

	}

}
