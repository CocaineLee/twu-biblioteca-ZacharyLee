package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books=new ArrayList<Book>();

    public Library(){
        this.books.add(new Book("book1","author1","2001"));
        this.books.add(new Book("book2","author2","2002"));
        this.books.add(new Book("book3","author3","2003"));
    }

    public String[] getBookList(){
        String[] BookList = new String[books.size()];

        for(int i =0;i< books.size();i++){
            BookList[i]=books.get(i).getBookInfo();
        }
        return BookList;
    }

    public void checkOutBook(String name){
        Book temp=new Book();
        for (Book book: this.books
             ) {
            if(name.equals(book.getTitle())) temp=book;
        }
        Integer beforeNum= this.books.size();
        this.books.remove(temp);
        if(beforeNum!=this.books.size()){
            System.out.println("Thank you! Enjoy the book");
        }
        else{
            System.out.println("Sorry ,that book is not available");
        }
    }
}
