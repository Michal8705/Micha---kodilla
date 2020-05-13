package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "Car", 1);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "Blue", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "Job", "Car");
            default:
                return null;
        }
    }
}
