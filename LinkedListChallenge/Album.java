package com.udemy.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private ArrayList<Song> songs;
    private String albumName;
    private String artist;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        // for each command in java
        for (Song checkedSong:this.songs) {
            if (checkedSong.getTitle() == title) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist (int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList (String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        } else {
            System.out.println("Song "+title+" could not be added, doesn't exist in the album...");
            return false;
        }
    }


}
