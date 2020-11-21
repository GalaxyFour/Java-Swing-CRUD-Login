/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MahasiswaCRUD;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 */
public class SekolahDatabase {
    private static Connection connection;
    
    public static Connection getConnection(){
        if (connection==null){
            try{
              String username = "root";
              String password = "";
              String url = "jdbc:mysql://localhost:3306/mahasiswa";
              
              MysqlDataSource source = new MysqlDataSource();
              source.setUser(username);
              source.setPassword(password);
              source.setURL(url);
              
              connection = source.getConnection();
            } catch (SQLException ex){
              //System.out.println("Error koneksi database");  
            }
        }       
        
        return connection;
    }
}
