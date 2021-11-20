package importstatement;
import java.util.Date;//explicit import highly recommended
import java.sql.*;//implicit import because * contains all the classes

public class Importst4 {

	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.getClass().getName());

	}

}
