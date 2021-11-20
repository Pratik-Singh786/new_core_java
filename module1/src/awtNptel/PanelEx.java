package awtNptel;
import java.awt.*;
public class PanelEx {

	public static void main(String[] args) 
	{
	 Frame  f=new Frame("Frame with panel");
	 Panel p=new Panel();
	 f.resize(200,200);
	 f.setBackground(Color.blue);
	 f.setLayout(null);
	 p.resize(100,100);
	 p.setBackground(Color.yellow);
	 f.add(p);
	 f.show();

	}

}
