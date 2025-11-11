
package Per1;

import java.util.*;

public class T1N3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan : ");
        double tabungan = input.nextDouble();

        System.out.println("Tahun\t4%\t\t5%\t\t6%\t\t7%");
        System.out.println("===================================================");

        for (int tahun = 1; tahun <= 10; tahun++) {
            double bunga4 = tabungan * Math.pow(1 + 0.04, tahun);
            double bunga5 = tabungan * Math.pow(1 + 0.05, tahun);
            double bunga6 = tabungan * Math.pow(1 + 0.06, tahun);
            double bunga7 = tabungan * Math.pow(1 + 0.07, tahun);

            System.out.printf("Tahun ke-%d\t%.1f\t%.1f\t%.1f\t%.1f\n",
                              tahun, bunga4, bunga5, bunga6, bunga7);
        }
    }
}
