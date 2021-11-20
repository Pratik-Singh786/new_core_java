package awtNptel;
import java.awt.*;
import java. applet.Applet;
public class CardLayoutEx  extends Applet
{
	CardLayout cl;
	public void init()
	{
		 cl=new CardLayout();
		setLayout(cl);
		add("1",new Button("card1" ));
		add("2",new Button("card2" ));
		add("3",new Button("card3" ));
		add("4",new Button("card4" ));
		add("5",new Button("card5" ));
		
		
	}
	public boolean keyDown(Event e,int key)
	{
		cl.next(this);
		return (true);
		
	}

}
