import java.sql.*;
class FirstJDBC
{
	public static void main(String args[]) 
	{
		
		//loading driver
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/youtube1";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		
		if(con.isClosed())
		{
			System.out.println("Connection is closed...");
		}
		else
		{
			System.out.println("Connection created sucessfully....");
		}
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
	
	}
}
