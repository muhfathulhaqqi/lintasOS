/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per4;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class Mobil extends Kendaraan{
    public Mobil (String nama){
        this.nama=nama;
    }
    
    public void jalankan(){
        System.out.println("nama: "+this.nama+ "\ncara menjalankan distater mesinnya");
    }
}

class tes{
    public static void main (String[] args){
        Mobil mobilku = new Mobil ("sedan");
        mobilku.jalankan();
    }
}