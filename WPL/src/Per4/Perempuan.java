/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per4;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public final class Perempuan extends Manusiaa {
    public Perempuan(Double tb){
        super(tb);
    }
    public final Double HtgBB(){
        return(super.getTinggiBadan()-100)*0.8;
    }
}
