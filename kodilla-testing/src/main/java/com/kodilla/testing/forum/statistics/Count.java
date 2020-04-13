package com.kodilla.testing.forum.statistics;


public class Count {
    double avUserPosts;
    double avUserComments;
    double avPostComments;
    Statistics statistics;

    public Count(Statistics statistics){
        this.statistics = statistics;
 /*     this.comments = statistics.commentsCount();
        this.users = statistics.usersNames().size();*/
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.avUserPosts = statistics.postsCount()/statistics.usersNames().size();
        this.avUserComments = statistics.commentsCount()/statistics.usersNames().size();
        this.avPostComments = statistics.commentsCount()/statistics.postsCount();
        if (this.statistics.postsCount() == 0.0){
            this.avUserPosts = 0.0;
            this.avPostComments = 0.0;
        }
        if (this.statistics.usersNames().size() == 0.0){
            this.avUserPosts = 0.0;
            this.avUserComments = 0.0;
        }
        if (this.statistics.commentsCount() == 0.0){
            this.avPostComments = 0.0;
            this.avUserComments = 0.0;
        }
    }

    public double getAvUserPosts(){
        return this.avUserPosts;
    }
    public double getAvUserComments(){
        return this.avUserComments;
    }
    public double getAvPostComments(){
         return this.avPostComments;
    }

    public void showStatistics(){
        System.out.println("Posts per user: " + this.avUserPosts);
        System.out.println("Comments per user: " + this.avUserComments);
        System.out.println("Comments per post: " + this.avPostComments);
    }
}
