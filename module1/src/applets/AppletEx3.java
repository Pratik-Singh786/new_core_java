package applets;
import java.applet.Applet;
import java.awt.Graphics;
public class AppletEx3  extends Applet
{
	StringBuffer strBuffer;
	public void init()
	{
	  strBuffer=new StringBuffer();
	  addItem("initializing the applet");
	}
	public void start()
	{
		addItem("starting the applet");
	}
	public void stop()
	{
		addItem("stoping the applet");
	}
	public void destroy()
	{
		addItem("unloading the applet");
	}
	void addItem(String word)
	{
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawRect(30, 30, 150, 160);
		g.drawString(strBuffer.toString(),10,20);
	}

}
