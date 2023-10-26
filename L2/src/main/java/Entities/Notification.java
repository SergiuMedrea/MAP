package Entities;

import java.util.Date;

public class Notification {
    private Long notificationID;
    private User user;
    private String contentType;
    private Date timestamp;
    private boolean isRead;

    public Notification(Long notificationID, User user, String contentType, Date timestamp, boolean isRead) {
        this.notificationID = notificationID;
        this.user = user;
        this.contentType = contentType;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    public Long getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Long notificationID) {
        this.notificationID = notificationID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
