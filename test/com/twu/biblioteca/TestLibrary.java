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
    public void testgetBookList(){
        String[] BookList= this.library.getBookList();
        assertEquals("book1",BookList[0]);
        assertEquals("book2",BookList[1]);
        assertEquals("book3",BookList[2]);
    }
}
