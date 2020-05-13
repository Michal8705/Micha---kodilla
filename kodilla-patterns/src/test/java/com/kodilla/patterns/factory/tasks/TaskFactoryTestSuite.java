package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertFalse(paintingTask.isTaskExecuted());
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertFalse(drivingTask.isTaskExecuted());
        Assert.assertEquals("Driving", drivingTask.getTaskName());
    }
}
