import java.util.Scanner;

class KenaikanGaji {
    private int id;
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double lembur;

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
        if (jabatan.equalsIgnoreCase("Direktur")) gajiPokok = 15000000;
        else if (jabatan.equalsIgnoreCase("Manager")) gajiPokok = 10000000;
        else if (jabatan.equalsIgnoreCase("Staff")) gajiPokok = 5000000;
        else gajiPokok = 0;
    }
    public String getJabatan() { return jabatan; }

    public double getGajiPokok() { return gajiPokok; }

    public void setLembur(int jam) {
        if (jabatan.equalsIgnoreCase("Direktur")) lembur = jam * 150000;
        else if (jabatan.equalsIgnoreCase("Manager")) lembur = jam * 100000;
        else if (jabatan.equalsIgnoreCase("Staff")) lembur = jam * 50000;
        else lembur = 0;
    }
    public double getLembur() { return lembur; }

    public double getGajiTotal() {
        return gajiPokok + lembur;
    }
}

public class MainGaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KenaikanGaji karyawan = new KenaikanGaji();

        System.out.print("Inputkan ID: ");
        karyawan.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Inputkan Nama: ");
        karyawan.setNama(sc.nextLine());

        System.out.print("Inputkan Jabatan (Direktur/Manager/Staff): ");
        karyawan.setJabatan(sc.nextLine());

        System.out.print("Inputkan Jam Lembur: ");
        karyawan.setLembur(sc.nextInt());

        System.out.println("\n Data Karyawan");
        System.out.println("ID: " + karyawan.getId());
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("Jabatan: " + karyawan.getJabatan());
        System.out.println("Gaji Pokok: " + karyawan.getGajiPokok());
        System.out.println("Lembur: " + karyawan.getLembur());
        System.out.println("Gaji Total: " + karyawan.getGajiTotal());
    }
}
