package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.junit.Test;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class
StatisticTest {

    // gdy liczba postów = 0
    @Test
    public void check0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 0.0;
        double comments = 5.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(0.0, avUserPosts,0.0);

    }
    // gdy liczba postów = 1000
    @Test
    public void check1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 1000.0;
        double comments = 500.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(100.0, avUserPosts,0.0);
        Assert.assertEquals(0.5, avPostComments,0.0);

    }
    // gdy liczba komentarzy = 0
    @Test
    public void check0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 1000.0;
        double comments = 0.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(0.0, avUserComments,0.0);
        Assert.assertEquals(0.0, avPostComments,0.0);

    }
    // gdy liczba komentarzy < liczba postów
    @Test
    public void commentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 50.0;
        double comments = 10.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(0.2, avPostComments,0.0);

    }
    // gdy liczba komentarzy > liczba postów
    @Test
    public void commentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 50.0;
        double comments = 100.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(2.0, avPostComments,0.0);

    }
    // gdy liczba użytkowników = 0
    @Test
    public void check0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 50.0;
        double comments = 100.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 0; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(0.0, avUserPosts,0.0);
        Assert.assertEquals(0.0, avUserComments,0.0);

    }
    // gdy liczba użytkowników = 100
    @Test
    public void check100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        double posts = 50.0;
        double comments = 100.0;
        List<String> users = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            users.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(users);

        Count count = new Count(statisticsMock);
        count.calculateAdvStatistics(statisticsMock);
        count.showStatistics();
        //When
        double avUserPosts = count.getAvUserPosts();
        double avUserComments = count.getAvUserComments();
        double avPostComments = count.getAvPostComments();

        //Then
        Assert.assertEquals(0.5, avUserPosts,0.0);
        Assert.assertEquals(1.0, avUserComments,0.0);

    }
}

