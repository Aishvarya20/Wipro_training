package Jdbc_eg;

import java.sql.*;

public class Egample5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Hospitaldata", "root", "Aishvarya@20");
//
//            String sql = "DELETE FROM patient WHERE name = ?";
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, "anshitha");
//
//            int rows = pstmt.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Record deleted successfully.");
//            } else {
//                System.out.println("No record found with the given name.");
//            }
            String[] oldnames = {"Anshita","Sri Laxmi" , "Ashwarya","Manjeera"};
            String[] newnames = {"Anshitha Sharma", "Sree","Aishvarya ch","Sai manjeera D"};
            String sql = "UPDATE patient SET name = ? WHERE name = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            for (int i = 0; i < oldnames.length; i++) {
                stmt.setString(1, newnames[i]);
                stmt.setString(2, oldnames[i]);
                stmt.executeUpdate();
                System.out.println("updated" + oldnames[i] + newnames[i]);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}