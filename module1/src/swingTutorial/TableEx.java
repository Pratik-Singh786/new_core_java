package swingTutorial;
import javax.swing.*;
public class TableEx {

	public static void main(String[] args) 
	{
		JFrame f= new JFrame();
		String data[][]= {{"101","Amit","67000"},{"102","Jai","78000"},{"103","Sachin","70000"}};
		String column[]= {"ID","Name","Salary"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
		
		
		

	}

}
