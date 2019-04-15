package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String publishDate;

    public Book(){}
    public String getTitle(){
        return this.title;
    }

    public  Book(String title, String author, String publishDate){
        this.title= title;
        this.author=author;
        this.publishDate=publishDate;
    }
    public String getBookInfo(){
        String BookInfo=String.format("%s-%s-%s",this.title,this.author,this.publishDate);
        return BookInfo;
    }
}
