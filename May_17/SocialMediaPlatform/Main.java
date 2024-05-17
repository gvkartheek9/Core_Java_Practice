package SocialMediaPlatform;

public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("alice", "alice@example.com", "password123");
        User user2 = new User("bob", "bob@example.com", "password456");

        // Create profiles
        user1.createProfile("alice_profile.jpg");
        user2.createProfile("bob_profile.jpg");

        // Add friends
        user1.addFriend(user2);
        user2.addFriend(user1);

        // User1 creates different types of posts
        user1.createPost("Hello, this is my first text post!", "text");
        user1.createPost("Check out this cool image!", "image");
        user1.createPost("Watch this awesome video!", "video");

        // User2 likes User1's posts
        for (Post post : user1.getPosts()) {
            user2.likePost(post);
        }

        // User2 comments on User1's posts
        user2.commentOnPost(user1.getPosts().get(0), "Nice text post!");
        user2.commentOnPost(user1.getPosts().get(1), "Great image!");
        user2.commentOnPost(user1.getPosts().get(2), "Awesome video!");

        // User1 sends a message to User2
        user1.sendMessage(user2, "Hey Bob, how are you?");

        // Displaying user1's posts
        System.out.println("Posts by " + user1.getUsername() + ":");
        for (Post post : user1.getPosts()) {
            post.displayPost();
            System.out.println("Likes: " + post.getLikesCount());
            System.out.println("Comments:");
            for (Comments comment : post.getComments()) {
                System.out.println("- " + comment.getContent());
            }
        }

        // Displaying messages of user1
        System.out.println("\nMessages of " + user1.getUsername() + ":");
        for (Message message : user1.getMessages()) {
            System.out.println("Message ID: " + message.getMessageId());
            System.out.println("From: " + message.getSender().getUsername());
            System.out.println("To: " + message.getReceiver().getUsername());
            System.out.println("Content: " + message.getContent());
        }

        // Displaying user1's friends
        System.out.println("\nFriends of " + user1.getUsername() + ":");
        for (User friend : user1.getFriends()) {
            System.out.println("- " + friend.getUsername());
        }
    }
}
