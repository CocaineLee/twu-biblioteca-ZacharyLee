package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String publishDate;
    private boolean isCheckout;

   // public Book(){}
    public String getTitle(){
        return this.title;
    }

    public boolean getIsCheckout(){return this.isCheckout;}
    public void setIsCheckout(boolean isCheckout){this.isCheckout=isCheckout;}
    public  Book(String title, String author, String publishDate){
        this.title= title;
        this.author=author;
        this.publishDate=publishDate;
        this.isCheckout = false;
    }

    //准备输出书籍信息
    public String getBookInfo(){
        String BookInfo=String.format("%s-%s-%s",this.title,this.author,this.publishDate);
        return BookInfo;
    }
}
