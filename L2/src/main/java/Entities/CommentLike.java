package Entities;

import java.util.Date;

public class CommentLike {
    private Comment comment;
    private User user;
    private Date timestamp;

    public CommentLike(Comment comment, User user, Date timestamp) {
        this.comment = comment;
        this.user = user;
        this.timestamp = timestamp;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
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
