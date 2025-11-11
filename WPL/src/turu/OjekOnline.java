/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turu;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public abstract class OjekOnline {
    
    protected double total;

    public OjekOnline(double total) {
        this.total = total;
    }

    public double getTot() {
        return total;
    }

    public abstract double pembayaran();
}