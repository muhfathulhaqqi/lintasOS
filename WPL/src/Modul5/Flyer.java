/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author Muh. Fathul Haqqi
 */
interface Flyer {
    public void takeoff();
    public void land();
    public void fly();
}

class airplane implements Flyer {
    public void takeoff(){
        System.out.println("takeoff");
    }
    public void land(){
        System.out.println("mendarat");
    }
    public void fly(){
        System.out.println("terbang");
    }
}
