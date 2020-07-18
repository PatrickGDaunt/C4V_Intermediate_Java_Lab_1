/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import javax.swing.JOptionPane;

/**
 *
 * @author patri
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PrintedBook book1 = new PrintedBook("Shelf 11", 5, "Penguin", "A Little Moss Soldier", "Gregory Swanson", 18.99, "13710011324");
        
        // Display message of Printedbook object
        JOptionPane.showMessageDialog(null, book1.toString());
    }
    
}
