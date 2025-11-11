package Per3;

public class Mahasiswa {
    String nama = "Muhammad Fathul Haqqi";
    public int usia = 19;
    protected String alamat = "Sambogunung, Dukun, Gresik";

    public void belajar() {
        System.out.println("Sedang belajar di Politeknik Elektronika Negeri Surabaya");
    }
}

class MahasiswaTRI extends Mahasiswa {
    public String NRP;
    public String MK;

    public MahasiswaTRI(String NRP1, String MK1) {
        NRP = NRP1;
        MK = MK1;
    }

    public void prak() {
        System.out.println("Mahasiswa atas nama " + nama +
                           " NRP " + NRP +
                           " sedang praktikum " + MK);
    }
}

class Main {
    public static void main (String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.belajar();
        
        System.out.println();
        
        MahasiswaTRI mtri = new MahasiswaTRI ("2424600037","WPL");
        mtri.prak();
    }
}