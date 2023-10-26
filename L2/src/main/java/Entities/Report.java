package Entities;

import Entities.Post;

import java.util.Date;

public class Report {
    private Long reportID;
    private User reporter;
    private Post post;
    private String reason;
    private Date timestamp;

    public Report(Long reportID, User reporter, Post post, String reason, Date timestamp) {
        this.reportID = reportID;
        this.reporter = reporter;
        this.post = post;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public Long getReportID() {
        return reportID;
    }

    public void setReportID(Long reportID) {
        this.reportID = reportID;
    }

    public User getReporter() {
        return reporter;
    }

    public void setReporter(User reporter) {
        this.reporter = reporter;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
