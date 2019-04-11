package com.twu.biblioteca;

public class Library {
    private  Book[] books;

    public Library(){
        this.books = new Book[3];
        this.books[0]= new Book("book1","author1","2001");
        this.books[1]= new Book("book2","author2","2002");
        this.books[2]= new Book("book3","author3","2003");
    }

    public String[] getBookList(){
        String[] BookList = new String[books.length];

        for(int i =0;i<books.length;i++){
            BookList[i]=books[i].getBookInfo();
        }
        return BookList;
    }
}
