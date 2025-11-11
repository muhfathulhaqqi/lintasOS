/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turu;

/**
 *
 * @author Muh. Fathul Haqqi
 */

import java.util.Scanner;

public class UBER extends OjekOnline {
    
    private final double DISKON = 0.15;

    public UBER(double total) {
        super(total);
    }

    @Override
    public double pembayaran() {
        double diskonAmount = total * DISKON;
        return total - diskonAmount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Perhitungan Biaya Ojek Online ---");
        System.out.print("Masukkan Total Biaya Awal: ");
        double biayaAwal = scanner.nextDouble();
        
        scanner.close();

        System.out.println("\nTotal Biaya Awal: " + biayaAwal);
        System.out.println("-------------------------------------");

        OjekOnline gojek = new GOJEK(biayaAwal);
        double bayarGojek = gojek.pembayaran();
        System.out.println("GOJEK (Diskon 5%): Rp" + bayarGojek);

        OjekOnline grab = new GRAB(biayaAwal);
        double bayarGrab = grab.pembayaran();
        System.out.println("GRAB (Diskon 10%): Rp" + bayarGrab);

        OjekOnline uber = new UBER(biayaAwal);
        double bayarUber = uber.pembayaran();
        System.out.println("UBER (Diskon 15%): Rp" + bayarUber);
    }
}
