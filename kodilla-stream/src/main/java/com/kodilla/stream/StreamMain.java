package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate today = LocalDate.now();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() =='M')
                .filter(user -> user.getPosts() > 0)
                .filter(user -> user.getbirthDate().isBefore(LocalDate.of(today.getYear()-20, today.getMonthValue(), today.getDayOfMonth())))
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}