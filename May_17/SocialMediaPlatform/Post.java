package SocialMediaPlatform;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class Post {
    private static int nextId = 1;
    private int postId;
    private String content;
    private String type;  // "text", "image", "video"
    private long timestamp;
    private int likesCount;
    private List<Comments> comments;

    public Post(String content, String type) {
        this.postId = nextId++;
        this.content = content;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
        this.likesCount = 0;
        this.comments = new LinkedList<>();
    }

    public void addComment(Comments comment) {
        comments.add(comment);
    }

    public void like() {
        likesCount++;
    }

    public int getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void displayPost() {
        switch (type) {
            case "text":
                System.out.println("Text Post: " + getContent());
                break;
            case "image":
                System.out.println("Image Post: " + getContent() + " [Image URL: " + getContent() + "]");
                break;
            case "video":
                System.out.println("Video Post: " + getContent() + " [Video URL: " + getContent() + "]");
                break;
        }
    }
}
