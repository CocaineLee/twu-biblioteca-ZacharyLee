package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();
    private List<Movies> movies=new ArrayList<Movies>();
    private List<CustomerInfo> customerInfos=new ArrayList<CustomerInfo>();
    public Library() {
        this.books.add(new Book("book1", "author1", "2001"));
        this.books.add(new Book("book2", "author2", "2002"));
        this.books.add(new Book("book3", "author3", "2003"));

        this.movies.add(new Movies("Movie1","director1","2001",1));
        this.movies.add(new Movies("Movie2","director2","2002",2));
        this.movies.add(new Movies("Movie3","director3","2003",3));

        this.customerInfos.add(new CustomerInfo("001","111","one","111@001.com","88888881"));
        this.customerInfos.add(new CustomerInfo("002","222","two","222@002.com","88888882"));
        this.customerInfos.add(new CustomerInfo("003","333","three","333@003.com","88888883"));
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

    public String[] getMovieList(){
        String[] movieList = new String[movies.size()];
        for(int i =0;i<movies.size();i++){
            if(!movies.get(i).getIsCheckout()){
                movieList[i]=movies.get(i).getMovieInfo();
            }
        }
        return movieList;
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
    public void checkOutMovie(String name) {
        boolean flag = false;
        for (Movies movie : this.movies
        ) {
            if (name.equals(movie.getName())) {
                if (!movie.getIsCheckout()) {

                    movie.setIsCheckout(true);
                    flag=true;
                }
            }
        }
        if(flag) System.out.println("Thank you! Enjoy the movie");
        else System.out.println("Sorry ,that movie is not available");
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

    public List<CustomerInfo> getCustomerInfos(){
        return this.customerInfos;
    }


}
