/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per4;

/**
 *
 * @author Muh. Fathul Haqqi
 */
abstract public class Manusiaa {
    private Double tinggiBadan;
    
    public Manusiaa(Double tb){
        tinggiBadan=tb;
    }
    public Double getTinggiBadan(){
        return tinggiBadan;
    }
    public abstract Double HtgBB();
}
