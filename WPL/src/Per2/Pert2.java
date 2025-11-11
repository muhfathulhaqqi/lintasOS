/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per2;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class Pert2 {
    public static void main(String[] args){
        Mahasiswa objek = new Mahasiswa("Kristin","Lebda",123456);
        Mahasiswa objek2= new Mahasiswa("Surabaya",18);
        
        System.out.println("NIM: "+objek.nim);
        objek.Tampil();
        System.out.println("Umur: "+objek2.umur);
        System.out.println("Alamat: "+objek2.alamat);
    }
}
