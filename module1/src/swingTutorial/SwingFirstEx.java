package swingTutorial;
import javax.swing.*;
public class SwingFirstEx {

	public static void main(String[] args)
	{
		JFrame  f=new JFrame("this is frame example");
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
