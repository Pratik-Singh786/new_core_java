package awtTutorial;
import java.awt.*;
public class AwtExAssociation 
{
	AwtExAssociation ()
	{
     Frame f=new Frame();
     Button b=new Button("click me");
     b.setBounds(30,50,80,30);
     f.add(b);
     f.setSize(300,300);
     f.setLayout(null);
     f.setVisible(true);
	}
   
	public static void main(String[] args) 
	{
		
		AwtExAssociation aw1=new AwtExAssociation();
	}

}
