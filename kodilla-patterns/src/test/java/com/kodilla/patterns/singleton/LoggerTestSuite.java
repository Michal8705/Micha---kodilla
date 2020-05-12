package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLog() {
        //Given
        //Logger logger = new Logger();
        Logger.getInstance().log("Last log");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Last log", lastLog);
    }
}
