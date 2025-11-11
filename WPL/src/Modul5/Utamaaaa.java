/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import java.util.Scanner;

public class Utamaaaa {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hitung hitung = new Hitung();
        int pilihan;
        double r = 0, t = 0, a = 0;

        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Input Data Bangun Ruang dan Bangun Datar");
            System.out.println("2. Lihat Data Bangun Ruang dan Bangun Datar");
            System.out.println("3. Keluar");
            System.out.print("Inputkan menu pilihan anda: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n***INPUT DATA BANGUN RUANG***");
                    System.out.print("Input jari-jari : ");
                    r = in.nextDouble();
                    System.out.print("Input tinggi    : ");
                    t = in.nextDouble();
                    System.out.print("Inputkan alas   : ");
                    a = in.nextDouble();

                    hitung.setData(r, t, a);
                    System.out.println("DATA SAVED");
                    break;

                case 2:
                    if (r == 0 || t == 0) {
                        System.out.println("\nBelum ada data tersimpan! Silakan input dulu.");
                    } else {
                        hitung.tampilkanHasil();
                    }
                    break;

                case 3:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 3);

        in.close();
    }
}
