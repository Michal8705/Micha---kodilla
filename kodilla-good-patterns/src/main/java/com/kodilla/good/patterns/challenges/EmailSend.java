package com.kodilla.good.patterns.challenges;

public class EmailSend implements InformationService {

    public void informUser(User user) {
        System.out.println("Email send to " + user.getName() + " " + user.getSurname());
    }
}
