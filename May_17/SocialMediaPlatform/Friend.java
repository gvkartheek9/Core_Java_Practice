package SocialMediaPlatform;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

public class Friend {
    private List<User> friends;

    public Friend() {
        this.friends = new LinkedList<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    public List<User> getFriendsList() {
        return friends;
    }
}
