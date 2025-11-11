/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cobacoba;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class Utama {
    public static void main(String[]args){
        Dana D = new Dana();
        Ovo O = new Ovo();
        Gopay G = new Gopay();
        D.cekSaldo();
        D.Bayar();
        O.cekSaldo();
        O.Bayar();
        G.cekSaldo();
        G.Bayar();
    }
}
