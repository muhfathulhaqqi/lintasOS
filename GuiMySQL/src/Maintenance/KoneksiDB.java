/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintenance;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class KoneksiDB {
    Connection con;
    Statement st;
    ResultSet rs;

    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try {
                String url="jdbc:mysql://localhost:3306/Kasir";
                String user="root";
                String password="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return koneksi;
    }
}
