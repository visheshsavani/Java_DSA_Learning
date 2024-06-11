package com.javavishesh;
import java.util.Scanner;
class library{
    private int total_books=100;
    public void addBook(int c){
        total_books+=c;
    }
    public void returnBook(int n){
        total_books-=n;
    }

    public int showAvailableBooks() {
        return total_books;
    }
    public void issuebook(int x){
        total_books-=x;
    }
}
public class mylibrary {
    public static void main(String[] args) {
        library rohan =new library();
        library librarian = new library();
        System.out.println("Welcome to Bombay South Library");
        System.out.println("Choose from the following");
        System.out.println("Press 1. To Return the book");
        System.out.println("Press 2. Want a book?");
        System.out.println("Press 3. Do you want to donate the book");
        System.out.println("Press 4. Show how many books are available");
        Scanner data= new Scanner(System.in);
        //System.out.println("Choose from the above options");
        int i= data.nextInt();

        switch (i){
            case 1:
                System.out.println("How many books you want to return");
                int a= data.nextInt();
                rohan.returnBook(a);
                System.out.println(rohan.showAvailableBooks());
                break;
            case 2:
                System.out.println("How many books you want to issue by a librarian");
                int b= data.nextInt();
            librarian.issuebook(b);
                System.out.println(rohan.showAvailableBooks());
            break;
            case 3:
                System.out.println("How many books you want to donate");
                int c= data.nextInt();
                librarian.addBook(c);
                System.out.println(rohan.showAvailableBooks());
                break;
            case 4:
                System.out.println(rohan.showAvailableBooks());
                break;
        }
    }
}
