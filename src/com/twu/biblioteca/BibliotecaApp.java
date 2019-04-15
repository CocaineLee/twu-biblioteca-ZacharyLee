package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        Library library=new Library();

        List<String> menuOfOptions = new ArrayList<String>();
        menuOfOptions.add("1.List of books");
        Menu menu = new Menu(menuOfOptions,library);
        menu.beforeLead();
        menu.printMenu();

        Scanner sc=new Scanner(System.in);
        Integer choice=sc.nextInt();
        if(choice==0) System.exit(0);
        menu.showInterface(choice);

        library.checkOutBook("book1");
        menu.showInterface(1); //test whether the book has been checkedout

        library.returnBook("book1");
        menu.showInterface(1);

    }
}
