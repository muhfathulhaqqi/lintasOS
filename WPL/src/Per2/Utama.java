import java.io.*;

public class Utama {
    public static void main(String[] kri) throws IOException {
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

        // OBJECT awal (kosong)
        Rice_Cooker rice = new Rice_Cooker("", "", 0.0, 0.0, "");

        // MENU
        while (true) {
            System.out.println("---MENU ELEKTRONIK---");
            System.out.println("1. Input Data Rice Cooker");
            System.out.println("2. Lihat Data Rice Cooker");
            System.out.println("3. Keluar");

            System.out.print("Inputkan pilihan menu : ");
            int pilihan = Integer.parseInt(k.readLine());
            System.out.println("");

            switch (pilihan) {
                case 1:
                    System.out.println("--INPUT DATA RICE COOKER--");
                    System.out.print("Inputkan brand Rice Cooker: ");
                    String brand = k.readLine();

                    System.out.print("Inputkan warna Rice Cooker: ");
                    String warna = k.readLine();

                    System.out.print("Inputkan berat Rice Cooker (Kg): ");
                    Double berat = Double.parseDouble(k.readLine());

                    System.out.print("Inputkan Kapasitas Memasak Rice Cooker (Liter): ");
                    Double kap_memasak = Double.parseDouble(k.readLine());

                    System.out.print("Inputkan Aksesoris Rice Cooker: ");
                    String aks = k.readLine();

                    // simpan data ke object rice
                    rice = new Rice_Cooker(brand, warna, berat, kap_memasak, aks);

                    System.out.println("DATA RICE COOKER BERHASIL DISIMPAN\n");
                    break;

                case 2:
                    System.out.println("--LIHAT DATA RICE COOKER--");
                    System.out.println("Brand : " + rice.getBrand());
                    System.out.println("Warna : " + rice.getWarna());
                    System.out.println("Berat : " + rice.getBerat() + " Kg");
                    System.out.println("Kapasitas Memasak : " + rice.getKapasitasMemasak() + " Liter");
                    System.out.println("Aksesoris : " + rice.getAksesoris() + "\n");
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!\n");
                    break;
            }
        }
    }
}
