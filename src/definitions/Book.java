/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorNameOfBook;
    private String ISBNNUmberOfBook;

    public Book() {
        bookName = "Fundamental Maths";
        authorNameOfBook = "RD Sharma";
        ISBNNUmberOfBook = "1856117647856";
    }

    public Book(String bookName, String authorNameOfBook, String ISBNNUmberOfBook) {
        this.bookName = bookName;
        this.authorNameOfBook = authorNameOfBook;
        this.ISBNNUmberOfBook = ISBNNUmberOfBook;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorNameOfBook() {
        return authorNameOfBook;
    }

    public void setAuthorNameOfBook(String authorNameOfBook) {
        this.authorNameOfBook = authorNameOfBook;
    }

    public String getISBNNUmberOfBook() {
        return ISBNNUmberOfBook;
    }

    public void setISBNNUmberOfBook(String ISBNNUmberOfBook) {
        this.ISBNNUmberOfBook = ISBNNUmberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorNameOfBook='" + authorNameOfBook + '\'' +
                ", ISBNNUmberOfBook='" + ISBNNUmberOfBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorNameOfBook, book.authorNameOfBook) &&
                Objects.equals(ISBNNUmberOfBook, book.ISBNNUmberOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorNameOfBook, ISBNNUmberOfBook);
    }
}




