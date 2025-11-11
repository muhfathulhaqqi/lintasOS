package Per3;

class Orang {
    private String nama;
    private int usia;

    public Orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void info() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
    }
}

class Pegawai extends Orang {
    protected String noPegawai;
    
    public Pegawai(String nama, int usia, String noPegawai) {
        super(nama, usia);
        this.noPegawai = noPegawai;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("No Pegawai: " + this.noPegawai);
    }
}

public class MainPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Edi", 25, "101");
        p1.info();
    }
}
