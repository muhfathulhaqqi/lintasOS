package Per1;

import java.io.*;

public class P1N5 {
    public static void main(String[] args) throws IOException{
        int angka[][] = new int [2][3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0; i<angka.length; i++){
            for (int j=0; j<angka[i].length; j++) {
                System.out.print("Masukkan data array baris ke - " + i + " dan kolom ke " + j + " ");
                angka[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        System.out.print("Silahkan tekan enter untuk mencetak");
        br.readLine();
        
        for(int i=0; i<angka.length; i++){
            for (int j=0; j<angka[i].length; j++){
                System.out.println("Data array baris ke - " + i + " dan kolom ke " + j + " adalah " + angka[i][j]);
            }
        }
    }
}
