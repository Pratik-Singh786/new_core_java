package awtNptel;
import java.awt.*;
public class ButtonEx {

	public static void main(String[] args) 
	{
		Frame f=new Frame ("Button Example");
		Button b=new Button("Click here");
		b.setBackground(Color.red);
		b.setBounds(150,50,100,30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
