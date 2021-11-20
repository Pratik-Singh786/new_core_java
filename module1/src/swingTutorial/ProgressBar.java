package swingTutorial;
import javax.swing.*;
public class ProgressBar  extends JFrame
{
	int i=0;
	int num=0;
	JProgressBar jb;
	ProgressBar()
	{
	    jb=new JProgressBar(0,2000);
		jb.setBounds(40,40,130,40);
	    jb.setValue(0);
	    jb.setStringPainted(true);
	    add(jb);
	    setSize(250,350);
	    setLayout(null);
		
	}
	public void iterate()
	{
		while(i<=2000)
		{
			jb.setValue(i);
			i=i+20;
			try
			{
				Thread.sleep(250);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	public static void main(String[] args) 
	{
		
		ProgressBar m=new ProgressBar();
		m.setVisible(true);
		m.iterate();
		

	}

}
