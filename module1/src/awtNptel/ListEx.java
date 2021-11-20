package awtNptel;
import java.awt.*;
public class ListEx {

	public static void main(String[] args)
	{
		Frame f=new Frame();
		List l1=new List(5);
		l1.setBounds(100,100,100,70);
		l1.add("item 1");
		l1.add("item 2");
		l1.add("item 3");
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		

	}

}
