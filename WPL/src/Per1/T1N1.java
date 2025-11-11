package Per1;

import java.io.*;

public class T1N1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Nama      : ");
        String nama = br.readLine();
        
        System.out.print("Masukkan NRP       : ");
        String nrp = br.readLine();

        System.out.print("Masukkan Prodi     : ");
        String prodi = br.readLine();
        
        System.out.println("\n===== KARTU MAHASISWA =====");
        System.out.println("Nama     : " + nama);
        System.out.println("NRP      : " + nrp);
        System.out.println("Prodi    : " + prodi);
        System.out.println("===========================");
    }
}
