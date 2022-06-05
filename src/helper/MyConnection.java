package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level; 
import java.util.logging.Logger;


public class MyConnection {
    private static String DRIVER  = "com.mysql.cj.jdbc.Driver";
    private static String URL   = "jdbc:mysql://localhost:3306/";
    private static String DB_NAME  = "db_212praktek6a";
    private static String TZ  = "?serverTimezone=Asia/Makassar";
    private static String USER = "root";
    private static String PASS  = "";

    public Connection getConnection(){
        Connection connection = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            connection = DriverManager.getConnection("jdbc:mysql://127.0.01/db_praktikum", "root", ""); 
            System.out.println("Berhasil Masuk");
            } catch (SQLException ex) { Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,
            null, ex);
            System.out.println("Gagal Masuk");
            }
            return connection;
    }
}