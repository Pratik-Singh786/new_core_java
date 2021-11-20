package awtNptel;
import java.awt.*;
public class TextAreaEx {

	public static void main(String[] args) 
	{
		Frame f=new Frame("textarea example "); //text area is different from text field in context of scroll bar 
		TextArea area=new TextArea("welcome to iit");
		area.setBounds(100,100,300,300);
		Button b=new  Button("click here");
		b.setBounds(100,350,100,30);
		b.setBackground(Color.cyan);
		f.add(b);
		f.add(area);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
