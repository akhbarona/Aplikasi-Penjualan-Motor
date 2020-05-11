/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class koneksiDB {
    private static Connection myKoneksiDB;
    
    public static Connection myDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/sistem_informasi_penjualan_motor";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            myKoneksiDB = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke database gagal"+e.getMessage());
        }
        return myKoneksiDB;
    }
}
