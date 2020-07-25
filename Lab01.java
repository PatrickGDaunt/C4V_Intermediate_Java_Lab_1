/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-22
 *
 */
package lab01;

// Imports
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author patri
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws UnacceptablePrice {
        // Declare varaibles
        int continueSearch = 1;
        String cont = null;
        int optionBook;                       
        
        // Create empty ArrayLists to store constructor paramters from user inputs       
        ArrayList<Object> printedbookArrayList = new ArrayList<Object>();
        ArrayList<Object> audiobookArrayList = new ArrayList<Object>();
        
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
                
                // Request input for price with UnacceptablePrice exception
                double priceDouble = 1.0;
                try {
                    priceDouble = Double.parseDouble
                        (JOptionPane.showInputDialog("Please enter book price"));
                    if (priceDouble <= 0) {
                        throw (new UnacceptablePrice());
                    }                    
                } catch (UnacceptablePrice pe) {
                    JOptionPane.showMessageDialog(null, pe.getMessage());  
                    System.exit(1);
                }             

                // Request input for ISBN
                String ISBNString = JOptionPane.showInputDialog("Please enter book ISBN");
                
                // Request input for location
                String locationString = JOptionPane.showInputDialog("Please enter book location");
                
                // Request number of copies
                int numCopiesInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter book quantity"));
                
                // Add new PrintedBook object to printedbookArrayList ArrayList with variables as arguements               
                printedbookArrayList.add(new PrintedBook(locationString, numCopiesInt, 
                        publisherString, titleString, authorString,
                        priceDouble, ISBNString));
             
                // Display the toString() of the last element in the printedbookArrayList ArrayList
                JOptionPane.showMessageDialog(null, 
                        printedbookArrayList.get(printedbookArrayList.size()-1).toString());
                
            } else if (optionBook == 2) {
                 // Request user input for PrintedBook
                // Request input for publisher
                String publisherString = JOptionPane.showInputDialog("Please enter book publisher");
                
                // Request input fot title
                String titleString = JOptionPane.showInputDialog("Please enter book title");
                
                // Request input for author
                String authorString = JOptionPane.showInputDialog("Please enter book author");
                
                // Request input for price with UnacceptablePrice exception
                double priceDouble = 1.0;
                try {
                    priceDouble = Double.parseDouble
                        (JOptionPane.showInputDialog("Please enter book price"));
                    if (priceDouble <= 0) {
                        throw (new UnacceptablePrice("Invalid Entry!\n\n " +
                                titleString + " audiobook is not free!"));
                    }                    
                } catch (UnacceptablePrice pe) {
                    JOptionPane.showMessageDialog(null, pe.getMessage());  
                    System.exit(1);
                }   
                
                // Request input for ISBN
                String ISBNString = JOptionPane.showInputDialog("Please enter book ISBN");
                
                // Request generated code location for AudioBook object
                String gen_locationString = JOptionPane.showInputDialog("Please "
                        + "enter audiobook code generator location");
                
                // Request generated code for AudioBook object
                String gen_codeString = JOptionPane.showInputDialog("Please enter the generated code for"
                        + " the audiobook");
                
                // Add new AudioBook object to audiobookArrayList ArrayList with variables as arguements               
                audiobookArrayList.add(new AudioBook(publisherString, 
                        titleString, authorString, priceDouble, ISBNString, 
                        gen_locationString, gen_codeString));
             
                // Display the toString() of the last element in the audiobookArrayList ArrayList
                JOptionPane.showMessageDialog(null, audiobookArrayList.get(audiobookArrayList.size()-1).toString());               
                
                
            } else {
                break;
            }
                                
            // Request to continue of exit
            cont = JOptionPane.showInputDialog("Type 1 to Continue or 2 to Exit");
            continueSearch = Integer.parseInt(cont);
            
        } while (continueSearch == 1);
        
    }
    
}
