/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", nameOfIssuedbooks=" + Arrays.toString(nameOfIssuedbooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(nameOfIssuedbooks, student.nameOfIssuedbooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, rollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(nameOfIssuedbooks);
        return result;
    }

}
