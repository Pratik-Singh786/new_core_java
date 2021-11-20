package swingTutorial;
import javax.swing.*;
public class MenuEx {

	public static void main(String[] args) 
	{
		JFrame  f=new JFrame("Menu and MenuItem Example");
		JMenuItem i1,i2,i3,i4,i5;
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("Menu");
		JMenu submenu =new JMenu("SubMenu");
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3");
		i4=new JMenuItem("Item 4");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setVisible(true);
		
		
		

	}

}
