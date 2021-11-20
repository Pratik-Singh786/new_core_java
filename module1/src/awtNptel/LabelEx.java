package awtNptel;
import java.awt.*;
public class LabelEx 
{

	public static void main(String[] args) 
	{
		Frame f=new Frame("Label Example");
		Label l1=new Label("first label");
		l1.setBounds(100,100,100,30);
		Label l2=new Label("Second label");
		l2.setBounds(100,150,100,30);
		f.add(l1);
		f.add(l2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		

	}

}
