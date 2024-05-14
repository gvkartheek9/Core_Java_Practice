package Bitlabs_Collection1_May_14.SocialNetworkUsingHashSet;

/*Social Network Recommendations:

A social network wants to recommend friends to users. They have a list of users and their
connections (friends). How can you efficiently check if two users are already friends using HashSets?
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Friends user1=new Friends("123");
        Friends user2=new Friends("987");

        //adding the friends list
        user1.addFriend(user2.getUserId());
        user1.addFriend("666");
        user2.addFriend("333");

        //get the friends list
        HashSet<String> user1Friends=user1.getFriends();
        HashSet<String>user2Friends=user2.getFriends();

        System.out.println("The userId : "+user1.getUserId()+" the friends : "+user1Friends);
        System.out.println("The userId : "+user2.getUserId()+" the friends : "+user2Friends);

        //Removing a friend
         user1.removeFriend(user2.getUserId());
         //updated friends list
        user1Friends=user1.getFriends();
        System.out.println("//after removing the 2's user id from the 1's friend list");
        System.out.println("The userId : "+user1.getUserId()+" The friends : "+user1Friends);


    }
}
