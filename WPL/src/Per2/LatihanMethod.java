/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per2;

/**
 *
 * @author Muh. Fathul Haqqi
 */
public class LatihanMethod {
    static void staticMethod(){
        System.out.println("Method Static");
    }
    public void publicMethod(){
        System.out.println("Method Public");
    }
    public static void main(String[] args){
        staticMethod();
        LatihanMethod objekMethod = new LatihanMethod();
        objekMethod.publicMethod();
    }
}
