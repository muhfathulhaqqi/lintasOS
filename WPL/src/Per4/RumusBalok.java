/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per4;

/**
 *
 * @author Muh. Fathul Haqqi
 */

public abstract class RumusBalok {
    
    private Double Panjang;
    private Double Lebar;
    private Double Tinggi;

    public RumusBalok(Double p, Double l, Double t) {
        this.Panjang = p;
        this.Lebar = l;
        this.Tinggi = t;
    }

    public Double getPanjang() {
        return Panjang;
    }

    public Double getLebar() {
        return Lebar;
    }

    public Double getTinggi() {
        return Tinggi;
    }

    public abstract Double HitungBalok();
}