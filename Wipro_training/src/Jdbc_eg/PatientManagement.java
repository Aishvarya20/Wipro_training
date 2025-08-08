package Jdbc_eg;
import java.sql.*;

public class PatientManagement {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitaldata", "root", "Aishvarya@20");

            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE patientsinfo (" +
            
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(100), " +
                                 "age INT, " +
                                 "disease VARCHAR(100), " +
                                 "admission_date VARCHAR(100), " +
                                 "doctor VARCHAR(100))";
            stmt.executeUpdate(createTable);
            System.out.println("Table created successfully.");

            String insertQuery = "INSERT INTO patientsinfo(name, age, disease, admission_date, doctor) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            String[][] patientsinfo = {
                {"Siri", "23", "Fever", "2025-08-01", "Dr.Spandana"},
                {"Karunya", "24", "Infection", "2025-08-02", "Dr.Mahesh"},
                {"Kavya", "25", "Asthma", "2025-08-03", "Dr.Spandana"}
            };

            for (String[] p : patientsinfo) {
                pstmt.setString(1, p[0]);
                pstmt.setInt(2, Integer.parseInt(p[1])); 
                pstmt.setString(3, p[2]); 
                pstmt.setString(4, p[3]); 
                pstmt.setString(5, p[4]); 
                pstmt.executeUpdate();
            }

            System.out.println("All patients registered successfully.");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
