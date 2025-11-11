/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per2;

import java.util.Scanner;

public class Tiket {
     String namaHotel, namaPesawat, tujuan;
    int jumlahKamar, jumlahPenumpang;
    double hargaKamar, hargaTiket;

    Scanner input = new Scanner(System.in);

    // Constructor: proses login
    public Tiket() {
        String user, pass;
        System.out.print("Masukkan Username: ");
        user = input.nextLine();
        System.out.print("Masukkan Password: ");
        pass = input.nextLine();

        if (user.equals("admin") && pass.equals("123")) {
            System.out.println("\nLogin Berhasil!\n");
        } else {
            System.out.println("Login Gagal. Program keluar.");
            System.exit(0);
        }
    }

    // Input data transaksi
    public void inputData() {
        System.out.println("-----Input Data Transaksi-----");
        System.out.print("Nama Hotel: ");
        namaHotel = input.nextLine();
        System.out.print("Jumlah Kamar: ");
        jumlahKamar = input.nextInt();
        System.out.print("Harga Per Kamar: ");
        hargaKamar = input.nextDouble();
        input.nextLine(); // buang enter
        System.out.print("Nama Pesawat: ");
        namaPesawat = input.nextLine();
        System.out.print("Jumlah Penumpang: ");
        jumlahPenumpang = input.nextInt();
        System.out.print("Harga Tiket Pesawat: ");
        hargaTiket = input.nextDouble();
        input.nextLine(); // buang enter
        System.out.print("Tujuan: ");
        tujuan = input.nextLine();
    }

    // Tampilkan data + perhitungan
    public void lihatData() {
        System.out.println("-------Transaksi Tiket Pesawat dan Hotel-------");
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Nama Hotel " + namaHotel + " - Jumlah Kamar " + jumlahKamar + " - Harga Per Kamar " + hargaKamar);

        // Hitung biaya hotel (diskon 45%)
        double diskon = 0.45 * hargaKamar;
        double totalHotel = (hargaKamar - diskon) * jumlahKamar;
        System.out.println("Total Biaya Kamar Hotel dengan diskon 45%: " + totalHotel);

        // Hitung biaya pesawat + asuransi
        double totalPesawat = (hargaTiket * jumlahPenumpang) + (jumlahPenumpang * 29000);
        System.out.println("Nama Pesawat " + namaPesawat + " - Jumlah Penumpang " + jumlahPenumpang + " - Harga Tiket Pesawat " + hargaTiket);
        System.out.println("Total Harga Tiket Pesawat: " + totalPesawat + " dengan biaya asuransi 29.000/penumpang");
    }
}
