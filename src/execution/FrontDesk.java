/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int RETURN_BOOK = 2;
    public static final int SHOW_MY_BOOKS = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Student student = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may i help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issued book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            userInput = scanner.nextInt();
            switch (userInput) {
                case NEW_BOOK:
                    System.out.println("Enter name of book you want to issue: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    student.getNewBook(bookName);
                    break;

                case RETURN_BOOK:
                    System.out.println("Enter the name of book you want to return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.doReturnBook(bookName);
                    break;

                case SHOW_MY_BOOKS:
                    System.out.println("ALL your issued books are: ");
                    scanner.nextLine();
                    student.myIssuedBooks();
                    break;

                case EXIT:
                    break;

                default:
                    System.out.println("YOU HAVE ENTERED WRONG CHOICE. PLEASE CHOOSE AGAIN!!!!");
                    break;
            }
        } while (userInput != EXIT);
        scanner.close();

    }
}
