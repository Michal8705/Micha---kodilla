package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements TasksObservable {
    private final List<TasksObserver> tasksObservers;
    private final List<String> tasks;
    private final String studentName;

    public Student(String studentName) {
       tasksObservers = new ArrayList<>();
       tasks = new ArrayList<>();
        this.studentName = studentName;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(TasksObserver tasksObserver) {
        tasksObservers.add(tasksObserver);
    }
    @Override
    public void notifyObserver() {
        for(TasksObserver tasksObserver : tasksObservers) {
            tasksObserver.update(this);
        }
    }
    @Override
    public void removeObserver(TasksObserver tasksObserver) {
        tasksObservers.remove(tasksObserver);
    }

    public String getStudentName() {
        return studentName;
    }
    public List<String> getTasks() {
        return tasks;
    }
}
