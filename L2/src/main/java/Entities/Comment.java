package Entities;

import java.util.Date;
import java.util.List;

public class Comment {
    private Long commentID;
    private Post post;
    private User user;
    private String content;
    private Date timestamp;
    private List<User> likes;

    public Comment(Long commentID, Post post, User user, String content, Date timestamp, List<User> likes) {
        this.commentID = commentID;
        this.post = post;
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
        this.likes = likes;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
}
