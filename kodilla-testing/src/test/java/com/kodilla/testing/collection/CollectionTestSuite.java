package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        //When
        OddNumbersExterminator task = new OddNumbersExterminator();
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(0, task.exterminate(list).size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(20);
        //When
        OddNumbersExterminator task = new OddNumbersExterminator();
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(2, task.exterminate(list).size());

    }
}
