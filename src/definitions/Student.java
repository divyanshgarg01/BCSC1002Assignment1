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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNameOfIssuedbooks() {
        return nameOfIssuedbooks;
    }

    public void setNameOfIssuedbooks(Book[] nameOfIssuedbooks) {
        this.nameOfIssuedbooks = nameOfIssuedbooks;
    }

}
