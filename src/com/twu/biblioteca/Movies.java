package com.twu.biblioteca;

public class Movies {
    private String name;
    private String director;
    private String year;
    private Integer rating ;
    private Boolean isCheckout;

    public Movies(String name,String director,String year,Integer rating){
        this.name=name;
        this.director=director;
        this.year=year;
        this.rating=rating;
        this.isCheckout=false;
    }

    public Boolean getIsCheckout(){
        return this.isCheckout;
    }

    public String getMovieInfo(){
        String MovieInfo = String.format("%s-%s-%s-%s",this.name,this.director,this.year,this.rating);
        return MovieInfo;
    }

    public String getName(){ return this.name;}

    public void setIsCheckout(Boolean isCheckout){this.isCheckout=isCheckout;}
}
