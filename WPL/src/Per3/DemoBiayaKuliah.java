import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DemoBiayaKuliah{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Mahasiswaaa[] daftarmahasiswa = new Mahasiswaaa[3];
        daftarmahasiswa[0] = new MahasiswaS1();
        daftarmahasiswa[1] = new MahasiswaS2();
        daftarmahasiswa[2] = new MahasiswaS3();

        System.out.print("Masukkan jumlah SKS yang Anda ambil: ");
        int sks = Integer.parseInt(br.readLine());

        for (Mahasiswaaa m : daftarmahasiswa){
            System.out.println("Total biaya kuliah = RP " + m.hitungBiayaKuliah(sks));
        }
    }
}