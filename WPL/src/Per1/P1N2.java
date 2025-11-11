package Per1;

import java.io.*;

public class P1N2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Anda : ");
        String nama = br.readLine();
        System.out.print("Nama Saya Adalah : " + nama);
    }
}
