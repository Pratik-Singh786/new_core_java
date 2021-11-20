package awtTutorial;
import java.awt.*;

public class AwtButtonEx  
{

	public static void main(String[] args) 
	{
		
      Frame  f=new Frame("button Example");
      Button b=new Button("click here")	;
      b.setBounds(50,100,80,30);
      f.add(b);
      f.setSize(300,300);
      f.setLayout(null);
      f.setVisible(true);
	}

}
