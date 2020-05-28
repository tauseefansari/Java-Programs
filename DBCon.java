import java.sql.*;
class DBCon
{
	public static void main(String[] args) throws Exception
	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Stud");
			System.out.println("\tRoll Number \t Name \t\t Address");
			while(rs.next())
			{
				System.out.println(" \t "+rs.getInt(1)+" \t\t "+rs.getString(2)+" \t "+rs.getString(3));
			}
			con.close();
	}
}