package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorName + ": You have new task from - " + student.getStudentName() + "\n" +
                " total: " + student.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}