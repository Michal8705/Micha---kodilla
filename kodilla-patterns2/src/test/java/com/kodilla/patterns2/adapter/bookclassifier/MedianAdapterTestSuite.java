package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //given
        Book book1 = new Book("John", "Smith", 2000, "123");
        Book book2 = new Book("Tim", "Marshal", 2005, "234");
        Book book3 = new Book("Tony", "Hawk", 2010, "345");

        Set<Book> books = new HashSet<>(Arrays.asList(book1, book2, book3));
        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int median = medianAdapter.publicationYearMedian(books);

        //then
        assertEquals(2005, median);
    }
}