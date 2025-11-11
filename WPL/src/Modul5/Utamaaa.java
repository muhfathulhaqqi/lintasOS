/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import java.io.*;
public class Utamaaa {
    public static void main(String[]kri) throws IOException {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        
        Kalkulator kal = new Kalkulator();
        
        System.out.print("inputkan angka 1: ");
        Double ang1 = Double.parseDouble(k.readLine());
        System.out.print("Inputkan angka 2: ");
        Double ang2 = Double.parseDouble(k.readLine());
        kal = new Kalkulator(ang1,ang2);
        System.out.println("");
        
        System.out.print("Hasil Penjumlahan: ");
        kal.Penjumlahan();
        System.out.print("Hasil Pengurangan: ");
        kal.Pengurangan();
        System.out.println("Hasil Perkalian: "+kal.Perkalian());
        System.out.println("Hasil Pembagian: "+kal.Pembagian());
    }
}
