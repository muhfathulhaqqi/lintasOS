/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per4;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import java.io.*;

public class Utama {
    public static void main(String[] args)throws IOException{
        BufferedReader k = new BufferedReader(new InputStreamReader (System.in));
        
        Manusiaa[] m = new Manusiaa[2];
        int a = 0;
        do {
            System.out.println("Pengguna "+(a+1));
            System.out.println("Inputkan tinggi badan anda: ");
            Double tb = Double.parseDouble(k.readLine());
            System.out.println("Inputkan jenis kelamain anda(L/P): ");
            String jenkel = k.readLine();
            
            if(jenkel.toUpperCase().equals("L")){
                m[a]=new Laki(tb);
                System.out.println("Berat badan ideal anda adalah: "+m[a].HtgBB());
                System.out.println("");
            }else{
                m[a] = new Perempuan(tb);
                System.out.println("Berat badan ideal anda adalah: "+m[a].HtgBB());
                System.out.println("");
            }a++;
        }while(a<2);
    }
}
