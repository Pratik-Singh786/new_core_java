package swingTutorial;
import javax.swing.*;
public class ComboBoxEx {

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("ComboBox example");
		String country[]= {"India","Aus","U.S.A","England"};
		JComboBox cb=new JComboBox(country);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		

	}

}
