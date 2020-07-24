/**
 *
 * Name of program:Bookstore Management System (BMS) 
 * @author Patrick D
 * Date first created:2020-07-09
 * Date last modified: 2020-07-23
 *
 */
package lab01;

public class AudioBook extends Book {

    // Declare subclass variables
    private String gen_location;
    private String gen_code;
    
    /**
     * 
     * @param book_publisher
     * @param book_title
     * @param book_author
     * @param book_price
     * @param book_ISBN
     * @param gen_location
     * @param gen_code 
     */
    public AudioBook(String book_publisher, String book_title, String book_author,
            double book_price, String book_ISBN, String gen_location, String gen_code) {
        super(book_publisher, book_title, book_author, book_price, book_ISBN);
        this.gen_location = gen_location;
        this.gen_code = gen_code;
        
    }
    /**
     * 
     * @return 
     */
    public String getGen_location() {
        return gen_location;
    }
    /**
     * 
     * @param gen_location 
     */
    public void setGen_location(String gen_location) {
        this.gen_location = gen_location;
    }
    /**
     * 
     * @return 
     */
    public String getGen_code() {
        return gen_code;
    }
    /**
     * 
     * @param gen_code 
     */
    public void setGen_code(String gen_code) {
        this.gen_code = gen_code;
    }

    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return ("The " + getBook_title() + ", written by " + getBook_author() +
                ", and published by " + getBook_publisher() + ". ISBN: " +
                getBook_ISBN() + ". Price: $" + getBook_price() + ".");
    }
}
