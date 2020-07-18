package lab01;

/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-09
 *
 */
public abstract class Book {

    /**
     * Book publisher
     */
    private String book_publisher;
    /**
     * Book title  
     */
    private String book_title;
    /**
     * Book author   
     */
    private String book_author;
    /**
     * Book price   
     */
    private double book_price;
    /**
     * Book ISBN   
     */
    private String book_ISBN;
    
    /**
    * 
    * @param book_publisher
    * @param book_title
    * @param book_author
    * @param book_price
    * @param book_ISBN 
    */
    public Book(String book_publisher, String book_title, String book_author, double book_price, String book_ISBN) {
        this.book_publisher = book_publisher;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_price = book_price;
        this.book_ISBN = book_ISBN;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_ISBN() {
        return book_ISBN;
    }

    public void setBook_ISBN(String book_ISBN) {
        this.book_ISBN = book_ISBN;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }
    
    
}


