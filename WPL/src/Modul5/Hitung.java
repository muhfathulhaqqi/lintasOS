/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class Hitung implements BangunDatar, BangunRuang {
    final Double PI = 3.14;
    Double r,t,a;
    Hitung(){}
    
    void setData(Double r, Double t, Double a){
        this.r = r;
        this.t = t;
        this.a = a;
    }
    
    public Double luasLingkaran(Double r){
        return PI*r*r;
    }
    public Double luasSegitiga(Double a, Double t){
        return 0.5*a*t;
    }
    public Double volumeKerucut(Double r, Double t){
        return (1.0/3)*PI*r*r*t;
    }
    public Double volumeBola(Double r){
        return (4.0/3)*PI*r*r*r;
    }
    public Double volumeTabung(Double r, Double t){
        return PI*r*r*t;
    }
    
    void tampilkanHasil() {
        System.out.println("\n***Lihat Data Bangun Ruang dan Bangun Datar***");
        System.out.println("Bangun Ruang");
        System.out.println("Volume Kerucut : " + volumeKerucut(r, t));
        System.out.println("Volume Bola    : " + volumeBola(r));
        System.out.println("Volume Tabung  : " + volumeTabung(r, t));
        System.out.println("\nBangun Datar");
        System.out.println("Luas Lingkaran : " + luasLingkaran(r));
        System.out.println("Luas Segitiga  : " + luasSegitiga(a, t));
    }
}
