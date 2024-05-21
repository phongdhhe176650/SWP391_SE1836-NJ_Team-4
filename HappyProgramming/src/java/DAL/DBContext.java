/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DBContext {
    public Connection connection;
    public DBContext() {
        try {
            String user = "sa";
            String pass = "sa";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HappyProgramming";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void main(String[] args) {
        DBContext db = new DBContext();
        if (db.connection != null) {
            try {
                if (!db.connection.isClosed()) {
                    System.out.println("Connection is valid and open.");
                } else {
                    System.out.println("Connection is closed.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error checking connection status: " + ex.getMessage());
            }
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
    }