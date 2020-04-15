package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(final int id, final String userName, final char sex,
                final LocalDate birthDate, final int posts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getbirthDate() {
        return birthDate;
    }
    public int getPosts() {
        return posts;
    }
    public double getYear() {

        Date d1 = new GregorianCalendar(birthDate.getYear(), birthDate.getMonthValue(), birthDate.getDayOfMonth(),
                23, 59).getTime();

        Date today = new Date();
        long days = today.getTime() - d1.getTime();

        return days/(1000 * 60 * 60 * 24)/365;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate='" + birthDate + '\'' +
                ", posts='" + posts + '\'' +
                '}';
    }
}