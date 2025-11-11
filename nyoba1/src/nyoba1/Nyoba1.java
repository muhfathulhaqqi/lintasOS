/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyoba1;

/**
 *
 * @author Muh. Fathul Haqqi
 */
import javax.swing.*;
import java.awt.event.*;

public class Nyoba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Event Handling");
        JButton button = new JButton("Klik Saya");
        
        button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Tombol telah di klik!");
        }
        });
        
     frame.add(button);
     frame.setSize(300,200);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    }
    
}
