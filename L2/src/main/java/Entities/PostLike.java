package Entities;

import Entities.Post;

import java.util.Date;

public class PostLike {
    private Post post;
    private User user;
    private Date timestamp;

    public PostLike(Post post, User user, Date timestamp) {
        this.post = post;
        this.user = user;
        this.timestamp = timestamp;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
