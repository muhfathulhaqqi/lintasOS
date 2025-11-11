import java.io.*;
public class Utamaa {
    public static void main(String[] kri)throws IOException {
    BufferedReader k=new BufferedReader(new InputStreamReader (System.in));
    Manusiaaa[] mns = new Manusiaaa[2];
    //DEKLARASI ATRIBUT
    int a=0;
    do{
        System.out.println("User "+(a+1));
        System.out.print("Masukkan tinggi badan anda(cm): ");
        double tb=Double.parseDouble(k.readLine());
        System.out.print("Masukkan jenis kelamin(L/P): ");
        String jenkel=k.readLine();
        if(jenkel.toUpperCase().equals("L")){
            mns[a]=new Laki(tb);
            System.out.println("Berat badan ideal seorang laki-laki seperti anda adalah :"+mns[a].HtgBB());
            System.out.println("");
        }
        else{
            mns[a]=new Perempuan(tb);
            System.out.println("Berat badan ideal seorang perempuan seperti anda adalah :"+mns[a].HtgBB());
            System.out.println("");
        }
        a++;
    }while(a<2);
}
}
