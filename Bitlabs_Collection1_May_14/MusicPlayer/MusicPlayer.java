package Bitlabs_Collection1_May_14.MusicPlayer;

import java.util.Collection;
import java.util.LinkedList;

public class MusicPlayer {
    private String songTitle=null;
    LinkedList<String >ll=new LinkedList<>();

    public void addSong(String songTitle){
        if(!ll.isEmpty()) {
            ll.addLast(songTitle);
        }
        else{
            ll.addFirst(songTitle);
        }
    }

    public void removeSong(String songTitle){
        if(ll.isEmpty()){
            System.out.println("The play list is Empty can't remove");
        }
        else{
            ll.remove(songTitle);
        }
    }

    public void playNext(){
        if(!ll.isEmpty()){
            String currentSong=ll.peekFirst();
            System.out.println("Playing "+currentSong);
        }
        else{
            System.out.println("The playlist is empty song not found");
        }
    }

    public void displayPlayList(){
        for(String name:ll){
            System.out.println("The song name is: "+name);
        }
    }
}
