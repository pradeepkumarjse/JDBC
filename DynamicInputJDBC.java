import java.sql.*;
import java.io.*;
class DynamicInputJDBC
{
	public static void main(String args[])
	{
		
		try{
		//loading clss
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection
		String url="jdbc:mysql://localhost:3306/youtube1";
		String dbname="root";
		String dbpassword="Pradeep@1234";
		
		Connection con=DriverManager.getConnection(url,dbname,dbpassword);
		
		
		//query
		String q="insert into table2(tname,tcity) values(?,?)";
		
		//prepared statement

		PreparedStatement pstmt=con.prepareStatement(q);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name=br.readLine();
		
		System.out.println("Enter your City: ");
		String city=br.readLine();
		
		
		//set the values to query
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		
		pstmt.executeUpdate();
		
		System.out.println("Data inserted sucessfully...");
		
		con.close();
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}