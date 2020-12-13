import java.sql.*;
class InsertUpdate{

public static void main(String args[]) {

	try{
		//loading clss
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//creating connection
		String url="jdbc:mysql://localhost:3306/youtube1";
		String name="root";
		String password="Pradeep@1234";
		
		Connection con=DriverManager.getConnection(url,name,password);
		
		String q="create table table2(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(200))";
		
		
		//create statement
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate(q);
		
		System.out.println("table created sucessfully...");
		
		
	}catch(Exception e){
		
		e.printStackTrace();
		
	}

}



}