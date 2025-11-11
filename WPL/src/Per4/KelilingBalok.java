package Per4;

import Per4.LuasBalok;
import Per4.RumusBalok;
import java.util.Scanner;

public final class KelilingBalok extends RumusBalok {

    public KelilingBalok(Double p, Double l, Double t) {
        super(p, l, t);
    }

    @Override
    public final Double HitungBalok() {
        Double p = getPanjang();
        Double l = getLebar();
        Double t = getTinggi();

        return 4 * (p + l + t);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Input Dimensi Balok ---");
        
        System.out.print("Masukkan nilai Panjang: ");
        Double panjang = scanner.nextDouble();

        System.out.print("Masukkan nilai Lebar: ");
        Double lebar = scanner.nextDouble();

        System.out.print("Masukkan nilai Tinggi: ");
        Double tinggi = scanner.nextDouble();

        scanner.close(); 
        
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Dimensi Balok: P=" + panjang + ", L=" + lebar + ", T=" + tinggi);

        LuasBalok luasObj = new LuasBalok(panjang, lebar, tinggi);
        Double luas = luasObj.HitungBalok();
        System.out.println("Luas Permukaan Balok: " + luas);
        
        KelilingBalok kelilingObj = new KelilingBalok(panjang, lebar, tinggi);
        Double keliling = kelilingObj.HitungBalok();
        System.out.println("Keliling Balok: " + keliling);
    }
}