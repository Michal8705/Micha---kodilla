package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        int[] intArray;
        intArray = new int[20];
        for(int i=0; i<20; i++){
            intArray[i] = i+5;
        };

        //When
        double average = ArrayOperations.getAverage(intArray);

        //Then
        Assert.assertEquals(14.5,average,0);
    }

}
