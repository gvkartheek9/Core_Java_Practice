package Bitlabs_Collection1_May_14.SocialNetworkUsingHashSet;

import java.util.HashSet;

public class Friends {
    private String userId;
    private final HashSet<String> friends;

    Friends(String userId){
        this.userId=userId;
        this.friends=new HashSet<>();
    }

    public String getUserId(){
        return userId;
    }

    public void addFriend(String friendId){
        friends.add(friendId);
    }

    public void removeFriend(String friendId){
        friends.remove(friendId);
    }

    public HashSet<String> getFriends(){
        return new HashSet<>(friends);
    }

}
