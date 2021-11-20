package jdbcDemo;
import java.sql.*;
public class PreparedStatementEx {

	public static void main(String[] args)
	
	{
		try
		{
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/user","root","");
		  
		  PreparedStatement st=con.prepareStatement("insert into  emp values(?,?,?)");
		  st.setInt(1, 101);
		  st.setString(2,"Ram");
		  st.setInt(3, 10000);
		  int i=st.executeUpdate();
		  System.out.println(i);
		  con.close();
		  System.out.println("Success");
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		


	}

}
