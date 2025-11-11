public class Elektronik {
    // DEKLARASI VARIABEL ATAU ATRIBUT
    private String brand, warna;
    private Double berat;

    // CONSTRUCTOR
    public Elektronik() {
    }

    public Elektronik(String brand, String warna, Double berat) {
        this.brand = brand;
        this.warna = warna;
        this.berat = berat;
    }

    // SETTER
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBerat(Double berat) {
        this.berat = berat;
    }

    // GETTER
    public String getBrand() {
        return brand;
    }

    public String getWarna() {
        return warna;
    }

    public Double getBerat() {
        return berat;
    }
}

// =========================
// Class turunan Rice_Cooker
// =========================
class Rice_Cooker extends Elektronik {
    // VARIABEL ATAU ATRIBUT DI DALAM CLASS
    private Double kapasitas_memasak;
    private String aksesoris;

    // CONSTRUCTOR
    public Rice_Cooker(String brand, String warna, Double berat) {
        super(brand, warna, berat);
    }

    public Rice_Cooker(String brand, String warna, Double berat, Double kap_memasak, String aksesoris) {
        super(brand, warna, berat);
        this.kapasitas_memasak = kap_memasak;
        this.aksesoris = aksesoris;
    }

    // SETTER
    public void setKapasitasMemasak(Double kap_memasak) {
        this.kapasitas_memasak = kap_memasak;
    }

    public void setAksesoris(String akse) {
        this.aksesoris = akse;
    }

    // GETTER
    public Double getKapasitasMemasak() {
        return kapasitas_memasak;
    }

    public String getAksesoris() {
        return aksesoris;
    }
}
