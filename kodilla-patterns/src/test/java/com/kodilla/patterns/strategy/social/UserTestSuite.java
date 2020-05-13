package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("John");
        User user2 = new YGeneration("Mark");
        User user3 = new ZGeneration("Gregor");
        //When
        String user1ShareBy = user1.sharePost();
        System.out.println("User1 should use: " + user1ShareBy);
        String user2ShareBy = user2.sharePost();
        System.out.println("User2 should use: "  + user2ShareBy);
        String user3ShareBy = user3.sharePost();
        System.out.println("User3 should use: "  + user3ShareBy);
        //Then
        Assert.assertEquals("[Twitter publisher]", user1ShareBy);
        Assert.assertEquals("[Snapchat publisher]", user2ShareBy);
        Assert.assertEquals("[Facebook publisher]", user3ShareBy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("John");
        //When
        String user1ShareBy = user1.sharePost();
        System.out.println("User1 should use: " + user1ShareBy);
        user1.setPublisher(new SnapchatPublisher());
        user1ShareBy = user1.sharePost();
        System.out.println("User1 now should use: " + user1ShareBy);
        //Then
        Assert.assertEquals("[Snapchat publisher]", user1ShareBy);
    }
}
