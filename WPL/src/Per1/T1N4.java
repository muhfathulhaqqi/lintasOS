package Per1;

import java.io.*;

public class T1N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nama          : ");
        String nama = br.readLine();

        System.out.print("Masukkan NIK           : ");
        String nik = br.readLine();

        System.out.print("Masukkan Umur          : ");
        int umur = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Alamat        : ");
        String alamat = br.readLine();

        System.out.print("Masukkan Jabatan (Dokter/Perawat/Apoteker/Cleaning) : ");
        String jabatan = br.readLine();

        System.out.print("Masukkan Jumlah Jam Kerja dalam 1 bulan : ");
        int jjk = Integer.parseInt(br.readLine());

        int upj = 0;
        if (jabatan.equalsIgnoreCase("Dokter")) {
            upj = 50000;
        } else if (jabatan.equalsIgnoreCase("Perawat")) {
            upj = 25000;
        } else if (jabatan.equalsIgnoreCase("Apoteker")) {
            upj = 20000;
        } else if (jabatan.equalsIgnoreCase("Cleaning") || jabatan.equalsIgnoreCase("Cleaning Service")) {
            upj = 15000;
        } else {
            System.out.println("Jabatan tidak dikenali!");
            return;
        }

        long gaji;
        if (jjk <= 40) {
            gaji = jjk * upj;
        } else {
            gaji = 40 * upj + (jjk - 40) * 15000;
        }


        System.out.println("\n===== DATA KARYAWAN =====");
        System.out.println("Nama     : " + nama);
        System.out.println("NIK      : " + nik);
        System.out.println("Umur     : " + umur);
        System.out.println("Alamat   : " + alamat);
        System.out.println("Jabatan  : " + jabatan);
        System.out.println("Jam Kerja: " + jjk + " jam");
        System.out.println("Gaji     : Rp " + gaji);
        System.out.println("==========================");
    }
}
