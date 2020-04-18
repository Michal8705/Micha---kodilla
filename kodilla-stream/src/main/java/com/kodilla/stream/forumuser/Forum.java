package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "user1",'M',
                LocalDate.of(2000,4,15), 3));
        theForumUsersList.add(new ForumUser(2, "user1",'M',
                LocalDate.of(1993,3,4), 0));
        theForumUsersList.add(new ForumUser(3, "user1",'M',
                LocalDate.of(2005,4,17), 2));
        theForumUsersList.add(new ForumUser(4, "user1",'F',
                LocalDate.of(2000,8,21), 5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
