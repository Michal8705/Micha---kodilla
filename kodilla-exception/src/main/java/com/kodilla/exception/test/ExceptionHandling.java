package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
           result = secondChallenge.probablyIWillThrowException(0,2);
        } catch (Exception e) {
            System.out.println("Look :" + e);
        } finally {
            System.out.println("Still running");
        }
        System.out.println(result);
    }
}
