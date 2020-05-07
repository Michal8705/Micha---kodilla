package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double valAdd = calculator.add(1,2);
        Double valSub = calculator.sub(3,2);
        Double valMul = calculator.mul(5,2);
        Double valDiv = calculator.div(4,2);
        //Then
        Assert.assertEquals(3, valAdd, 0);
        Assert.assertEquals(1, valSub, 0);
        Assert.assertEquals(10, valMul, 0);
        Assert.assertEquals(2, valDiv, 0);
    }
}
