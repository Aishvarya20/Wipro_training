package Jdbc_eg;
import java.sql.*;


public class Egample6 {

	public static void main(String[] args) {
		 try {	          
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/Datahospital", "root", "Aishvarya@20");

//	            String query = "INSERT INTO patient(name, age, disease, admission_date(varchar, doctor) VALUES (?, ?, ?, ?, ?)";
//	            PreparedStatement pstmt = con.prepareStatement(query);
//	            
//	            String[][] patientsinfo = {
//	                {"aishvarya", "23", "Fever", "2025-08-01", "Dr.karun"},
//	                {"likitha", "24", "Infection", "2025-08-02", "Dr.Mahesh"},
//	                {"meena", "25", "Asthma", "2025-08-03", "Dr.jyothi"}
//	            };	           
//	            for (String[] p : patientsinfo) {
//	                pstmt.setString(1, p[0]); 
//	                pstmt.setInt(2, Integer.parseInt(p[1])); 
//	                pstmt.setString(3, p[2]); 
//	                pstmt.setString(4, p[3]); 
//	                pstmt.setString(5, p[4]); 
//	                pstmt.executeUpdate();
//	            }	       
//	            System.out.println("All patients registered successfully.");
	            con.close();
	        } 
		 	catch (Exception e) 
		 	{
		 		e.printStackTrace();
		 	}
	}
}
