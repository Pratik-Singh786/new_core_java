package jdbcDemo;
import java.sql.*;
public class CreatinTableEx {

	public static void main(String[] args) 
	{

		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","pratik@123");
		    Statement st=con.createStatement();
		    st.execute("create table  javacourse1 (roll integer primary key,name varchar(30),marks integer not null,grade varchar(20)) ");                
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	

	}

}
