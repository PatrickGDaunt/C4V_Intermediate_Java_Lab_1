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

public abstract class Book {

    // Create super class variables
    private String book_publisher;
    private String book_title;
    private String book_author;
    private double book_price;
    private String book_ISBN;
    
    /**
    * Constructor to instantiate a new book object
    * @param book_publisher
    * @param book_title
    * @param book_author
    * @param book_price
    * @param book_ISBN 
    */
    public Book(String book_publisher, String book_title, String book_author, 
            double book_price, String book_ISBN) {
        this.book_publisher = book_publisher;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_price = book_price;
        this.book_ISBN = book_ISBN;
    }

    /**
     * Gets the book's publisher
     * @return A string representing the book's publisher
     */
    public String getBook_publisher() {
        return book_publisher;
    }

    /**
     * Creates a publisher for it's book object
     * @param book_publisher A String representing the book's publisher
     */
    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    /**
     * Gets the book's title
     * @return A string representing the book's title
     */
    public String getBook_title() {
        return book_title;
    }

    /**
     * Creates a title for it's book object
     * @param book_title A String representing the book's title
     */
    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }
    
    /**
     * 
     * @return 
     */
    public String getBook_author() {
        return book_author;
    }

    /**
     * 
     * @param book_author 
     */
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
    
    /**
     * 
     * @return 
     */
    public String getBook_ISBN() {
        return book_ISBN;
    }
    
    /**
     * 
     * @param book_ISBN 
     */
    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }
    
    /**
     * 
     * @return 
     */
    public double getBook_price() {
        return book_price;
    }
    
    /**
     * 
     * @param book_price 
     */
    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }
    
    // Require subclasses to override
    public abstract String toString();
    
    
}


