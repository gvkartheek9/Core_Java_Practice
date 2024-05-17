package SocialMediaPlatform;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    private String profilePicture;
    private Friend friends;
    private List<Post> posts;
    private List<Message> messages;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.friends = new Friend();
        this.posts = new LinkedList<>();
        this.messages = new LinkedList<>();
    }

    public void createProfile(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void addFriend(User friend) {
        friends.addFriend(friend);
    }

    public void createPost(String content, String type) {
        Post post = new Post(content, type);
        posts.add(post);
    }

    public void likePost(Post post) {
        post.like();
    }

    public void commentOnPost(Post post, String commentContent) {
        Comments comment = new Comments(commentContent);
        post.addComment(comment);
    }

    public void sendMessage(User receiver, String content) {
        Message message = new Message(this, receiver, content);
        messages.add(message);
    }

    public String getUsername() {
        return username;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<User> getFriends() {
        return friends.getFriendsList();
    }
}
