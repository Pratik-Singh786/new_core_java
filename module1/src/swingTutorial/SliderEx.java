package swingTutorial;
import javax.swing.*;
public class SliderEx  extends JFrame
{
	public SliderEx()
	{
		JSlider slider =new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		JPanel panel=new JPanel();
		add(slider);
	}
	public static void main(String[] args) 
	{
		
		SliderEx se=new SliderEx();
		se.pack();
		se.setVisible(true);
		

	}

}
