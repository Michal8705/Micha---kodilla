package com.kodilla.spring.portfolio;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> toDoList = board.getToDoList().getTasks();
        toDoList.add("Add task to do");

        List<String> inProgressList = board.getInProgressList().getTasks();
        inProgressList.add("Add task in progress");

        List<String> doneList = board.getDoneList().getTasks();
        doneList.add("Add task done");
        //Then
        Assert.assertEquals("Add task to do", toDoList.get(0));
        Assert.assertEquals("Add task in progress", inProgressList.get(0));
        Assert.assertEquals("Add task done", doneList.get(0));
    }
}
