package Bitlabs_Collection1_May_14.MusicPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MusicPlayer song1=new MusicPlayer();
        song1.addSong("janam janam");
        song1.addSong("kanam kanam");
        song1.addSong("pavam pavam");
        song1.displayPlayList();
        System.out.println("------------------------------");
        song1.removeSong("pavam pavam");
        song1.displayPlayList();
        song1.playNext();
        song1.playNext();

    }
}
