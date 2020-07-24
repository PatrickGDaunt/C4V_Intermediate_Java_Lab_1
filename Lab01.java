/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-22
 *
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
        // Declare varaibles
        int continueSearch = 1;
        String cont = null;
        int optionBook;
        int n = 0;
               
        
        // Create empty arrays to store constructor paramters from user inputs
        
        PrintedBook[] p = new PrintedBook[4];
        AudioBook[] a = new AudioBook[4];
        
        do {
            optionBook = Integer.parseInt(JOptionPane.showInputDialog("Please select "
                    + "type of book:\n\t 1 - Printed Book\n\t 2 - Audiobook"
                    + "\n\t Enter any other number to exit"));
            
            if (optionBook == 1){
                // Request user input for PrintedBook
                // Request input for publisher
                String publisherString = JOptionPane.showInputDialog("Please enter book publisher");
                // Request input fot title
                String titleString = JOptionPane.showInputDialog("Please enter book title");
                // Request input for author
                String authorString = JOptionPane.showInputDialog("Please enter book author");
                // Request input for price
                double priceDouble = Double.parseDouble(JOptionPane.showInputDialog("Please enter book price"));
                // Request input for ISBN
                String ISBNString = JOptionPane.showInputDialog("Please enter book ISBN");
                // Request input for location
                String locationString = JOptionPane.showInputDialog("Please enter book location");
                // Request number of copies
                int numCopiesInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter book quantity"));
                // Create new object array element with variables as arguements
                p[0] = new PrintedBook(locationString, numCopiesInt, 
                        publisherString, titleString, authorString, 
                        priceDouble, ISBNString); 
             
                // Display message of Printedbook object
                JOptionPane.showMessageDialog(null, p[0].toString());
                
            } else if (optionBook == 2) {
                 // Request user input for PrintedBook
                // Request input for publisher
                String publisherString = JOptionPane.showInputDialog("Please enter book publisher");
                // Request input fot title
                String titleString = JOptionPane.showInputDialog("Please enter book title");
                // Request input for author
                String authorString = JOptionPane.showInputDialog("Please enter book author");
                // Request input for price
                double priceDouble = Double.parseDouble(JOptionPane.showInputDialog("Please enter book price"));
                // Request input for ISBN
                String ISBNString = JOptionPane.showInputDialog("Please enter book ISBN");
                // Request generated code location for AudioBook object
                String gen_locationString = JOptionPane.showInputDialog("Please enter audiobook code generator"
                        + "location");
                // Request generated code for AudioBook object
                String gen_codeString = JOptionPane.showInputDialog("Please enter the generated code for"
                        + "the audiobook");
                // Create new object array element with variables as arguements
                a[0] = new AudioBook(publisherString, titleString, authorString,
                        priceDouble, ISBNString, gen_locationString, 
                        gen_codeString);
                
                // Display message of Audiobook object
                JOptionPane.showMessageDialog(null, a[0].toString());
                
                
            } else {
                break;
            }
                                
            // Request to continue of exit
            cont = JOptionPane.showInputDialog("Type 1 to Continue or 2 to Exit");
            continueSearch = Integer.parseInt(cont);
            
        } while (continueSearch == 1);
        
    }
    
}
