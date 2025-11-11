/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guimysql;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class GuiMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//memanggil driver jdbc
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception ex) {
            System.err.println("Error (1):"+ex);
            System.exit(1);
        }
        
        //Bentuk koneksi
        Connection koneksi=null;
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kasir","root","");
        System.out.println("Koneksi Berhasil");
        }
        catch (Exception ex){
        System.err.println("Error (1):"+ex);
            System.exit(1);
    }
    }
    
}
