package applets;
import java.awt.*;
import java.applet.*;
public class AppletEx  extends Applet
{
	 String msg;
	 public void init()
	 {
		 setBackground(Color.cyan);
		// setBackground(Color.red);
		 msg="inside init()--";
		 
	 }
	  public void start()
	  {
		  msg+="Inside start()--";
	  }
	  public void paint(Graphics g)
	  {
		  g.drawString(msg, 50, 50); // for the alignment of text
	  }

}
