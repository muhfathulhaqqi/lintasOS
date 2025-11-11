/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per3;

import java.util.Scanner;

// Superclass
public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagi tidak boleh 0");
            return 0;
        }
    }
}

// Subclass
class MatematikaCanggih extends Matematika {
    public int modulus(int a, int b) {
        return a % b;
    }
}

// Main class
class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angka dari user
        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int b = input.nextInt();

        MatematikaCanggih mc = new MatematikaCanggih();

        System.out.println("\n------------------------");
        System.out.println("     Hasil Operasi");
        System.out.println("------------------------");
        System.out.println(a + " + " + b + " = " + mc.pertambahan(a, b));
        System.out.println(a + " - " + b + " = " + mc.pengurangan(a, b));
        System.out.println(a + " * " + b + " = " + mc.perkalian(a, b));
        System.out.println(a + " % " + b + " = " + mc.modulus(a, b));

        input.close();
    }
}
