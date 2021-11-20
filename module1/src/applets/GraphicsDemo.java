package applets;
import java.applet.Applet;
import java.awt.*;

public class GraphicsDemo  extends Applet
{
 public void paint(Graphics g)
 {
	 g.drawString("Welcome to my applet", 20, 20);// writing content
	 g.setColor(Color.cyan); //color the Applet
	 g.drawLine(20, 30, 20, 300);
	 g.drawRect(70, 100, 30, 30);
	 g.fillRect(170, 100, 30, 30);
	 g.drawOval(70, 200, 30, 30);
	 g.setColor(Color.pink);
	 g.fillOval(100,100,30,30);
	 g.drawArc(90, 150, 30, 30, 30, 270);
	 g.fillArc(270,150,30,30,0,180);
 }
	

}
