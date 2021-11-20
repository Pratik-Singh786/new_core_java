package swingTutorial;
import javax.swing.*;

public class SpinnerEx 
{

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Spinner example");
		SpinnerModel value =new SpinnerNumberModel(5,0,10,1);
		JSpinner spinner=new JSpinner(value);
		spinner.setBounds(100,100,50,30);
		f.add(spinner);
		f.setLayout(null);
		f.setVisible(true);
	

	}

}
