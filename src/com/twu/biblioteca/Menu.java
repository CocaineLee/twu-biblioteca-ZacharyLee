package com.twu.biblioteca;

import java.util.List;

public class Menu {
    private List<String> menuOfOptions;
    private Library library;
    public Menu(List<String> menuOfOptions,Library library) {
        this.menuOfOptions = menuOfOptions;
        this.library=library;
    }
    public Boolean checkCusInf(String id,String passsWord){
        for(CustomerInfo cusInfo:this.library.getCustomerInfos()){
            if(cusInfo.getId().equals(id)&&cusInfo.getPassword().equals(passsWord)) return true;

        }
        return false;
    }

    public void beforeLead(){
        System.out.println("Please choose the option by num,press 0 to quit");
    }

    public void printMenu(){
        for (String option: menuOfOptions
             ) {
            System.out.println(option);
        }
    }

    public void showInterface(Integer choice){
        if(choice==1){
            String[] bookList= this.library.getBookList();
            for (String bookTitle:bookList
            ) {
                System.out.println(bookTitle);
            }
        }
        if(choice==2){
            String[] movieList=this.library.getMovieList();
            for(String movie:movieList){
                System.out.println(movie);
            }
        }
        else{
            System.out.println("Please select a valid option");
        }
    }


}
