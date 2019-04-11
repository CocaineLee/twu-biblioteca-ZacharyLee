package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestLibrary {
    private Library library;

    @Before
    public void creatLibrary(){
        this.library = new Library();
    }

    @Test
    public void testgetBookInfo(){
        String[] BookList= this.library.getBookList();
        assertEquals("book1-author1-2001",BookList[0]);
        assertEquals("book2-author2-2002",BookList[1]);
        assertEquals("book3-author3-2003",BookList[2]);
    }
}
