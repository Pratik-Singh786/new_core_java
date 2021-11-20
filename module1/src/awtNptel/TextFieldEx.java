package awtNptel;
import java.awt.*;
public class TextFieldEx {

	public static void main(String[] args) 
	{
		
		Frame f=new Frame("TextField example");
		TextField t1,t2;
	    t1=new TextField("Welcome to iit  kharagpur");
		t1.setBounds(50,100,100,30);
	    t2=new TextField("neptel java tutorials");
		t2.setBounds(50,150,100,30);
		f.add(t1);
		f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
