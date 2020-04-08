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
        for (int n = 0; n < 0; n++) {
            list.add(n);
        }
        //When
        OddNumbersExterminator task = new OddNumbersExterminator();
        task.exterminate(list);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < 10; n++) {
            list.add(n);
        }
        //When
        OddNumbersExterminator task = new OddNumbersExterminator();
        task.exterminate(list);
        int number = 0;
        int result = 0;
        for (int n = 0; n < list.size(); n++) {
            number = list.get(n);
            if (number % 2 != 0) {
                result = result +1;
            }
        }
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(result, 0);

    }
}
