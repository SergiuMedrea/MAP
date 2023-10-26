package Entities;

import Entities.Comment;

import java.util.Date;
import java.util.List;

public class Post {
    private Long postID;
    private User user;
    private String contentType;
    private Date timestamp;
    private String location;
    private List<Comment> comments;
    private List<Tag> tags;

    public Post(Long postID, User user, String contentType, Date timestamp, String location, List<Comment> comments, List<Tag> tags) {
        this.postID = postID;
        this.user = user;
        this.contentType = contentType;
        this.timestamp = timestamp;
        this.location = location;
        this.comments = comments;
        this.tags = tags;
    }

    public Long getPostID() {
        return postID;
    }

    public User getUser() {
        return user;
    }

    public String getContentType() {
        return contentType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getLocation() {
        return location;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
