package Per1;

import java.util.*;

public class P1N4 {
public static void main(String[] args){
    Scanner emoh = new Scanner (System.in);
    int jumlahmhs = 1;
    int total = 0;
    while (jumlahmhs<4){
        System.out.print("Nilai mahasiswa ke-" + jumlahmhs+" : ");
        int skor = Integer.parseInt(emoh.nextLine());
        if (skor<0){
            do {
                System.out.print("Nilai mahasiswa ke-"+jumlahmhs+" : ");
                skor = Integer.parseInt(emoh.nextLine());
            } while (skor<0);
        }
        total = total + skor;
        jumlahmhs++;
    }
    System.out.println("Nilai total + "+total);
    double rata = total/3;
    System.out.println("Nilai rata-rata = "+rata);
}
}
