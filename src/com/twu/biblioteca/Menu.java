package com.twu.biblioteca;

import java.util.List;

public class Menu {
    private List<String> menuOfOptions;
    private Library library;
    public Menu(List<String> menuOfOptions,Library library) {
        this.menuOfOptions = menuOfOptions;
        this.library=library;
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
        else{
            System.out.println("Please select a valid option");
        }
    }


}
