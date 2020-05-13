package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean executed = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("We finished driving");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        DrivingTask that = (DrivingTask) o;
//
//        if (!taskName.equals(that.taskName)) return false;
//        if (!where.equals(that.where)) return false;
//        return using.equals(that.using);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = taskName.hashCode();
//        result = 31 * result + where.hashCode();
//        result = 31 * result + using.hashCode();
//        return result;
//    }
}
