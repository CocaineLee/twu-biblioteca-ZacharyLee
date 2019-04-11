package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for\n" +
                "great book titles in Bangalore!");
        Library library=new Library();
        String[] bookList= library.getBookList();
        for (String bookTitle:bookList
             ) {
            System.out.println(bookTitle);
        }
    }
}
