package lab01;

/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-09
 *
 */
public class Book {

    /**
     * Book publisher
     */
    public String book_publisher;
    /**
     * Book title  
     */
    public String book_title;
    /**
     * Book author   
     */
    public String book_author;
    /**
     * Book price   
     */
    public double book_price;
    /**
     * Book ISBN   
     */
    public String book_ISBN;
       
    /**
     * Returns the book publisher
     * @return String
     */
    public String getBook_publisher() {
        return book_publisher;
    }
    /**
     * Sets the book publisher
     * @param book_publisher 
     */
    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }
    /**
     * Returns the book title
     * @return String
     */
    public String getBook_title() {
        return book_title;
    }
    /**
     * Sets the title of the book
     * @param book_title
     */
    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }
    /**
     * Returns the author of the book
     * @return String
     */
    public String getBook_author() {
        return book_author;
    }
    /**
     * Sets the author of the book
     * @param book_author
     */
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
    /**
     * Returns the price of the book
     * @return double
     */
    public double getBook_price() {
        return book_price;
    }
    /**
     * Sets the price of the book
     * @param book_price
     */
    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }
    /**
     * Returns the ISBN of the book
     * @return String
     */
    public String getBook_ISBN() {
        return book_ISBN;
    }
    /**
     * Sets the ISBN of the book
     * @param book_ISBN
     */
    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }
}


