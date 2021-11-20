package applets;
import java.applet.Applet;
import java.awt.*;
public class DisplayImage  extends Applet
{
	
   Image picture;
   public void init()
   {
	   picture =getImage(getDocumentBase(),"background.jpg");
   }
   public void paint(Graphics g)
   {
	   g.drawImage(picture,30,30,this);
   }
}
