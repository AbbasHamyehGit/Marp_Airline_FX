
// file for creating a connection between the java project and the mySQL database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
   static final String DB_URL = "jdbc:mysql://localhost/JDBC";
   static final String USER = "root";
   static final String PASS = "NewPassword";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE ROY";
         stmt.executeUpdate(sql);
         String sql2 = "INSERT INTO student " + "VALUES ()";
         stmt.executeUpdate(sql2);
         System.out.println("Database created successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 



      

}}