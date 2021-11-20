package awtNptel;
import java.awt.*;

public class CheckBoxGroupEx 
{
	CheckBoxGroupEx()
	{
		Frame f=new Frame("checkbox group example");
		CheckboxGroup cbg=new CheckboxGroup();// Check box group example 
		Checkbox cb =new Checkbox("c++",cbg,false);
		cb.setBounds(100,100,100,50);
		Checkbox cb1 =new Checkbox("java",cbg,true);
		cb1.setBounds(100,150,120,50);
		
		f.add(cb);
		f.add(cb1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
	}
	public static void main(String[] args) 
	{
		
		CheckBoxGroupEx cbx=new CheckBoxGroupEx ();

	}

}
