package Per2;


public class Mahasiswa {
    String namaD, namaB,alamat;
    int nim,umur;
    
    public Mahasiswa(String nmDepan, String nmBlakang, int nim){
        this.namaD=nmDepan;
        this.namaB=nmBlakang;
        this.nim=nim;
    }
    Mahasiswa(String almt, int umr){
        this.alamat=almt;
        this.umur=umr;
    }
    void Tampil(){
        System.out.println("Nama Lengkap: "+namaD+" "+namaB);
    }
}