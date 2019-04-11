package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestBook {
    private Book book;

    @Before
    public void creatBook(){
        this.book = new Book("book1","author1","2001");
    }

    @Test
    public void testBookInfo(){
        assertEquals("book1-author1-2001",this.book.getBookInfo());
    }
}
