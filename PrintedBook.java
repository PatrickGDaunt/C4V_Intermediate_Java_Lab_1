/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-23
 *
 */
package lab01;

import javax.swing.JOptionPane;

public class PrintedBook extends Book {
    
    // Declaring subclass variables
    private String book_location;
    private int num_of_copies;

    /**
     * 
     * @param book_location
     * @param num_of_copies
     * @param book_publisher
     * @param book_title
     * @param book_author
     * @param book_price
     * @param book_ISBN 
     */
    public PrintedBook(String book_location, int num_of_copies, 
            String book_publisher, String book_title, String book_author, 
            double book_price, String book_ISBN) {
        super(book_publisher, book_title, book_author, book_price, book_ISBN);
        this.book_location = book_location;
        this.num_of_copies = num_of_copies;
    }
    
    /**
     * 
     * @return 
     */
    public String getBook_location() {
        return book_location;
    }
    
    /**
     * 
     * @param book_location 
     */
    public void setBook_location(String book_location) {
        this.book_location = book_location;
    }
    
    /**
     * 
     * @return 
     */
    public int getNum_of_copies() {
        return num_of_copies;
    }
    
    /**
     * 
     * @param num_of_copies 
     */
    public void setNum_of_copies(int num_of_copies) {
        this.num_of_copies = num_of_copies;       
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return ("The " + getBook_title() + ", written by " + getBook_author() +
                ", and published by " + getBook_publisher() + ". ISBN: " +
                getBook_ISBN() + ". Price: $" + getBook_price() + ". Location: "
                + getBook_location() + ". Copies remaining: " + 
                getNum_of_copies() + ".");
    }
}
    

 

