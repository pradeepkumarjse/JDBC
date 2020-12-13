import java.sql.*;
class DBInsertJDBC
{
	public static void main(String args[])
	{
		
		try{
		//loading clss
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection
		String url="jdbc:mysql://localhost:3306/youtube1";
		String name="root";
		String password="Pradeep@1234";
		
		Connection con=DriverManager.getConnection(url,name,password);
		
		
		//query
		String q="insert into table2(tname,tcity) values(?,?)";
		
		//prepared statement

		PreparedStatement pstmt=con.prepareStatement(q);
		
		//set the values to query
		pstmt.setString(1,"pradeep kumar");
		pstmt.setString(2,"madhubani");
		
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