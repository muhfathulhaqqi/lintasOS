/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class Kalkulator implements Operasi {
    private Double angka1, angka2;
    
    public Kalkulator(){
    }
    public Kalkulator(Double angka1,Double angka2){
        this.angka1=angka1;
        this.angka2=angka2;
    }
    public Double getAngka1(){
        return angka1;
    }
    public Double getAngka2(){
        return angka2;
    }
    public void Penjumlahan(){
        System.out.println(angka1+angka2);
    }
    public void Pengurangan(){
        System.out.println(angka1-angka2);
    }
    public Double Perkalian(){
        return angka1*angka2;
    }
    public Double Pembagian(){
        return angka1/angka2;
    }
}
