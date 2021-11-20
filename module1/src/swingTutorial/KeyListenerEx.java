package swingTutorial;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class KeyListenerEx extends Applet implements KeyListener
{

   String msg="";int X=10,Y=20;
   public void init()
   {
	   addKeyListener(this);
	   requestFocus();
   }
   public void keyPressed(KeyEvent e)
   {
	   showStatus("key down");
   }
   public void keyReleased(KeyEvent e)
   {
	   showStatus("key released");
   }
   public void keyTyped(KeyEvent e)
   {
	  msg+=e.getKeyChar();
	  repaint();
   }
   public void paint(Graphics g)
   {
	   g.drawString(msg, X, Y);
   }
   
}
