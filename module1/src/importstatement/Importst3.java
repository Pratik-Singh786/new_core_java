package importstatement;

import java.util.*; //it contain date
import java.sql.*;  // it also contain date,they both causes ambiguity problem to take date class from which package
import java.util.Date;// it take date from here

public class Importst3 {

	public static void main(String[] args) 
	{
		Date d= new Date();

	}

}
