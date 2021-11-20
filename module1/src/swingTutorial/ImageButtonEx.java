package swingTutorial;
import javax.swing.*;
public class ImageButtonEx 
{

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Button example ");
		JButton b=new JButton(new ImageIcon("D:\\photo1.jpeg"));
		b.setBounds(50,100,100,100);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
