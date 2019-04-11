package com.twu.biblioteca;

public class Library {
    private  Book[] books;

    public Library(){
        this.books = new Book[3];
        this.books[0]= new Book("book1");
        this.books[1]= new Book("book2");
        this.books[2]= new Book("book3");
    }

    public String[] getBookList(){
        String[] BookList = new String[books.length];

        for(int i =0;i<books.length;i++){
            BookList[i]=books[i].getBookTitle();
        }
        return BookList;
    }
}
