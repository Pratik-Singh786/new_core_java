package swingTutorial;
import javax.swing.*;
public class CheckBoxEx {

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("checkbox example");
		JCheckBox cb=new JCheckBox("C++");
		cb.setBounds(100,100,50,50);
		JCheckBox cb1=new JCheckBox("java",true);
		cb1.setBounds(100,150,50,50);
		f.add(cb);
		f.add(cb1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		


	}

}
