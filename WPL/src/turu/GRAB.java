/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turu;

import turu.OjekOnline;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class GRAB extends OjekOnline {
    
    private final double DISKON = 0.10;

    public GRAB(double total) {
        super(total);
    }

    @Override
    public double pembayaran() {
        double diskonAmount = total * DISKON;
        return total - diskonAmount;
    }
}