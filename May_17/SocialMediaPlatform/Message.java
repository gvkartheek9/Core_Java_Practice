package SocialMediaPlatform;

public class Message {
    private static int nextId = 1;
    private int messageId;
    private User sender;
    private User receiver;
    private String content;
    private long timestamp;

    public Message(User sender, User receiver, String content) {
        this.messageId = nextId++;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public int getMessageId() {
        return messageId;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }
}
