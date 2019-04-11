package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestBook {
    private Book book;

    @Before
    public void creatBook(){
        this.book = new Book("book1");
    }

    @Test
    public void testBookTitle(){
        assertEquals("book1",this.book.getBookTitle());
    }
}
