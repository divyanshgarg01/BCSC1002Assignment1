/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    private String[] availableBooks = new String[50];

    public String[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(String[] availableBooks) {
        this.availableBooks = availableBooks;
    }
}
