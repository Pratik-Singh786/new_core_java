package applets;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PaintingInApplet  extends Applet implements MouseMotionListener

{
	public void init()
	{
		addMouseMotionListener(this);
		setBackground(Color.red);
	}
	public void mouseDragged(MouseEvent me)
	{
		Graphics g=getGraphics();
		g.setColor(Color.white);
		g.fillOval(me.getX(),me.getY(),5,5);
		
	}
	public void mouseMoved(MouseEvent me)
	{
		
	}

}
