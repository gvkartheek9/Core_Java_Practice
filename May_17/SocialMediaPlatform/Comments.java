package SocialMediaPlatform;


public class Comments {
    private static int nextId = 1;
    private int commentId;
    private String content;
    private long timestamp;

    public Comments(String content) {
        this.commentId = nextId++;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public String getContent() {
        return content;
    }
}
