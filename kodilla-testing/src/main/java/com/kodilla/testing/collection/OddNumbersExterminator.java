package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers) {

        int number = 0;
        for (int n = 0; n < numbers.size(); n++) {
            number = numbers.get(n);
            if (number % 2 != 0) {
                numbers.remove(n);
            }
        }
    }
}

