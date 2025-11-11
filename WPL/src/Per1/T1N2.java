package Per1;

import java.io.*;

public class T1N2 {
     public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan hari (Senin-Minggu): ");
        String hari = br.readLine();

        switch (hari.toLowerCase()) {
            case "senin":
            case "selasa":
            case "rabu":
            case "kamis":
            case "jumat":
                System.out.println("Hari " + hari + " adalah hari aktif kuliah.");
                break;

            case "sabtu":
            case "minggu":
                System.out.println("Hari " + hari + " adalah hari libur.");
                break;

            default:
                System.out.println("Input hari tidak valid!");
        }
    }
}
