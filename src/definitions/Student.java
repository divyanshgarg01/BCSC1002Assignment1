/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    private String studentName;
    private long rollNumber;
    private int numberOfBooksIssued;
    int numberOfIssuedBooks = 0;
    private Book[] nameOfIssuedbooks;

    public Student() {
        studentName = "Not Given";
        rollNumber = 191500275;
        numberOfBooksIssued = 5;
        this.nameOfIssuedbooks = new Book[10];
        for (int indexNumber = 0; indexNumber < nameOfIssuedbooks.length; indexNumber++) {
            nameOfIssuedbooks[indexNumber] = new Book("Book " + (indexNumber));
        }
    }
}
