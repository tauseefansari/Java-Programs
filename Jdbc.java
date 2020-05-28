import java.sql.*;
class Jdbc
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:odbc:myjavadb");
		System.out.println("Connection Success");
	}
}