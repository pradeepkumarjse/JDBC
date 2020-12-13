import java.sql.*;
import java.io.*;
class ImageSave{

public static void main(String args[]) {

  try{
	  
	  //loader driver class
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  //creating connection
	  
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube1","root","Pradeep@1234");
	  
	  //query
	  
	  String q="insert into images(pic) values(?)";
	  
	  PreparedStatement pstmt=con.prepareStatement(q);
	  
	  FileInputStream fis=new FileInputStream("business.jpg");
	  
	  pstmt.setBinaryStream(1,fis,fis.available());
	  
	  pstmt.executeUpdate();
	  
	  System.out.println("done....");
	  
	  
	  
	  
	  
	  
  }catch(Exception e){
	  
	  
	  
   System.out.println("error....");
   e.printStackTrace();
   
   
   
  }


}

}