package Entities;

import java.util.Date;
import java.util.List;

public class User {
    private Long userID;
    private String username;
    private String email;
    private String password;
    private Date registrationDate;
    private List<Post> posts;
    private List<Comment> comments;
    private List<User> followers;
    private List<User> following;

    public User(Long userID, String username, String email, String password, Date registrationDate, List<Post> posts, List<Comment> comments, List<User> followers, List<User> following) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
        this.posts = posts;
        this.comments = comments;
        this.followers = followers;
        this.following = following;
    }

    public Long getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }
}
