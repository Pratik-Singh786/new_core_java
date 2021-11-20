package swingTutorial;
import javax.swing.*;
import java.awt.event.*;
public class PopMenuEx {

	public static void main(String[] args)
	{
		final JFrame f=new JFrame();
		final JPopupMenu popupmenu=new JPopupMenu("Edit");
		JMenuItem cut=new JMenuItem("cut");
		JMenuItem copy=new JMenuItem("copy");
		JMenuItem paste=new JMenuItem("paste");
		popupmenu.add(cut);
		popupmenu.add(copy);
		popupmenu.add(paste);
		f.addMouseListener(new MouseAdapter()
				{
			      public void mouseClicked(MouseEvent e)
			      {
			    	  popupmenu.show(f,e.getX(),e.getY());
			      }
		
				});
		f.add(popupmenu);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
