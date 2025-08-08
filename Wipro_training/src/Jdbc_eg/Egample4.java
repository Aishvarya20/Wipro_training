package Jdbc_eg;
import java.sql.*;

public class Egample4
{
public static void main(String[] args)
 {
 
 try {
  
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitaldata", "root", "Aishvarya@20");
  
  String sql = "UPDATE patient SET name =? WHERE name=?";
  PreparedStatement pstmt = con.prepareStatement(sql);
  
  pstmt.setString(1, "Sai Manjeera");
  pstmt.setString(2, "Manjeera");
  
  System.out.println("  patientsupdated successfully");
  con.close();
     }
 catch (Exception e)
 {
 e.printStackTrace();
   
 }
 }
}