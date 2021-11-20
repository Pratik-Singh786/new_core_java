package awtNptel;
import java.awt.*;

public class CheckboxEx
{

	CheckboxEx()
	{
	  Frame f=new Frame("checkbox example");
	  Checkbox c=new Checkbox("c++");
	  c.setBounds(100,100,100,30);
	  Checkbox c1=new Checkbox("java",true);
	  c1.setBounds(100,150,100,30);
	  f.add(c);
	  f.add(c1);
	  f.setSize(400,400);
	  f.setLayout(null);
	  f.setVisible(true);
	}
	
	 public static void main(String[] args) 
	{ 
		 CheckboxEx ce=new CheckboxEx();
	}

}
