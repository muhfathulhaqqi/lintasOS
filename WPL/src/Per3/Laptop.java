/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per3;

/**
 *
 * @author Muh. Fathul Haqqi
 */
class Laptop extends Elektronik {
    private String NamaModel = "Thinkpad";

    public static void main(String[] args) {
        // MEMBUAT OBJECT
        Elektronik lap = new Elektronik();
        Laptop lap1 = new Laptop();

        // PANGGIL METHOD SPESIFIKASI DARI CLASS ELEKTRONIK
        lap.spesifikasi();

        // Menampilkan nilai atribut brand (dari class Elektronik)
        // dan nilai dari atribut model dari class Laptop
        System.out.println("Brand Laptop: " + lap.brand + " " + lap1.NamaModel);
    }
}
