package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library() {
        this.books.add(new Book("book1", "author1", "2001"));
        this.books.add(new Book("book2", "author2", "2002"));
        this.books.add(new Book("book3", "author3", "2003"));
    }

    public String[] getBookList() {
        String[] BookList = new String[books.size()];

        for (int i = 0; i < books.size(); i++) {
            if(!books.get(i).getIsCheckout()) {
                BookList[i] = books.get(i).getBookInfo();
            }
        }
        return BookList;
    }

    public void checkOutBook(String name) {
        boolean flag = false;
        for (Book book : this.books
        ) {
            if (name.equals(book.getTitle())) {
                if (!book.getIsCheckout()) {

                    book.setIsCheckout(true);
                    flag=true;
                }
            }
        }
        if(flag) System.out.println("Thank you! Enjoy the book");
        else System.out.println("Sorry ,that book is not available");
    }

    public  void returnBook (String name) {
        boolean flag = false;
        for (Book book : this.books) {
            if (name.equals(book.getTitle())) {
                if (book.getIsCheckout()) {
                    book.setIsCheckout(false);

                    flag = true;
                }
            }
        }
        if(flag) System.out.println("Thank you for returning the book");
        else System.out.println("That is not a valid book to return");
    }

}
