package Repo;

import Entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepo {
    private static Map<Long, User> users = new HashMap<>();
    private static Map<Long, Post> posts = new HashMap<>();
    private static Map<Long, Comment> comments = new HashMap<>();
    private static Map<Long, Tag> tags = new HashMap<>();
    private static Map<Long, Notification> notifications = new HashMap<>();
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Report> reports = new HashMap<>();
    private static List<CommentLike> commentLikes = new ArrayList<>();
    private static List<PostLike> postLikes = new ArrayList<>();
    private static List<PostTag> postTags = new ArrayList<>();

    public static void saveUser(User user) {
        users.put(user.getUserID(), user);
    }

    public static void savePost(Post post) {
        posts.put(post.getPostID(), post);
    }

    public static void saveComment(Comment comment) {
        comments.put(comment.getCommentID(), comment);
    }

    public static void saveTag(Tag tag) {
        tags.put(tag.getTagID(), tag);
    }

    public static void saveNotification(Notification notification) {
        notifications.put(notification.getNotificationID(), notification);
    }

    public static void saveMessage(Message message) {
        messages.put(message.getMessageID(), message);
    }

    public static void saveReport(Report report) {
        reports.put(report.getReportID(), report);
    }

    public static void addCommentLike(CommentLike commentLike) {
        commentLikes.add(commentLike);
    }
    public static void addPostLike(PostLike postLike) {
        postLikes.add(postLike);
    }

    public static void addPostTag(PostTag postTag) {
        postTags.add(postTag);
    }

    public static User getUserByID(Long userID) {
        return users.get(userID);
    }

    public static Post getPostByID(Long postID) {
        return posts.get(postID);
    }

    public static Comment getCommentByID(Long commentID) {
        return comments.get(commentID);
    }

    public static Tag getTagByID(Long tagID) {
        return tags.get(tagID);
    }
    public static void deleteUser(Long userID) {
        users.remove(userID);
    }

    public static void deletePost(Long postID) {
        posts.remove(postID);
    }

    public static void deleteComment(Long commentID) {
        comments.remove(commentID);
    }

    public static void deleteTag(Long tagID) {
        tags.remove(tagID);
    }
}
