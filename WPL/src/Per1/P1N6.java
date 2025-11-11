package Per1;

import java.io.*;

public class P1N6 {
    private static int a,b,c;
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Masukkan bilangan perttama : ");
            a = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan bilangan kedua : ");
            b = Integer.parseInt(br.readLine());
           
            c = tambah();
            System.out.println("Hasil Penjumlahan : " + c);
            System.out.println("Hasil pengurangan : " + kurang());
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");
        }
    }
    
private static int tambah(){
return (a+b);
}
private static int kurang(){
return (a-b);
}
}

