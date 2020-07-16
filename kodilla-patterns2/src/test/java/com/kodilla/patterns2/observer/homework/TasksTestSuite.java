package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        Student student3 = new Student("student3");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);

        //When
        student1.addTask("Task1");
        student1.addTask("Task2");
        student2.addTask("Task3");
        student2.addTask("Task4");
        student3.addTask("Task5");
        student3.addTask("Task6");
        student3.addTask("Task7");

        //Than
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
        assertEquals(3, student3.getTasks().size());
    }
}
