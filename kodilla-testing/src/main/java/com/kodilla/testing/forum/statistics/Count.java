package com.kodilla.testing.forum.statistics;

public class Count {
    double users;
    double posts;
    double comments;
    double avUserPosts;
    double avUserComments;
    double avPostComments;

    public Count(Statistics statistics){
        this.posts = statistics.postsCount();
        this.comments = statistics.commentsCount();
        this.users = statistics.usersNames().size();
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.avUserPosts = this.posts/this.users;
        this.avUserComments = this.comments/this.users;
        this.avPostComments = this.comments/this.posts;
        if (this.posts == 0.0){
            this.avUserPosts = 0.0;
            this.avPostComments = 0.0;
        }
        if (this.users == 0.0){
            this.avUserPosts = 0.0;
            this.avUserComments = 0.0;
        }
        if (this.comments == 0.0){
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
        System.out.println("Comments per user: " + this.comments);
        System.out.println("Comments per post: " + this.avPostComments);
    }
}
