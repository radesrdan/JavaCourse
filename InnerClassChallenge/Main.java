package com.udemy.InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Billy Idol","Billy Idol");
        album.addSong("White Wedding",6.41);
        album.addSong("Come on, Come on",4.01);
        album.addSong("Hot in the city",3.36);
        album.addSong("Love Calling",4.57);
        album.addSong("Dead on Arrival",3.55);
        albums.add(album);


        album = new Album("All Our Gods Have Abandoned Us","Architects");
        album.addSong("Gravity",3.18);
        album.addSong("Match made in heaven",3.48);
        album.addSong("Gone with the wind",3.46);
        album.addSong("Memento Mori",8.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(1).addToPlayList("Gravity",playList);
        albums.get(1).addToPlayList("Match made in heaven",playList);
        albums.get(1).addToPlayList("Gone with the wind",playList);
        albums.get(1).addToPlayList("Winners",playList); //does not exist, should not work
        albums.get(1).addToPlaylist(4,playList);

        play(playList);





    }

    private static void play (LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;



        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0 ) {
            System.out.println( "No songs in the playlist" );
        } else {
            System.out.println("Now playing: " + listIterator.next().toString() );
        }

        while (!quit){
            System.out.println("Enter your choice\n");
            int actionItem = scanner.nextInt();
            scanner.nextLine();

            switch (actionItem) {
                case 0:
                    System.out.println("Breaking the program...");
                    quit = true;
                    break;
                case 1:
                    if (!isForward) {
                        listIterator.next();
                    }
                    isForward = true;
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("We have reached the end of the list");
                        isForward = false;
                    }
                    break;
                case 2:
                    if (isForward) {
                        listIterator.hasPrevious();
                        listIterator.previous();
                    }
                    isForward = false;
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the list");
                        isForward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
//                    printList(playList);
                    break;
                case 5:
//                    printMenu()
                    break;

            }
        }

    }
}
