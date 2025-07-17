package BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;

public class Playlist {
    ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<String>();
    }

    public void addSong(String songName) {
        this.songs.add(songName);
    }

    public ArrayList<String> getSongs() {
        return this.songs;
    }

    public FavouriteSongIterator getIterator(String iteratorType) {
        switch (iteratorType) {
            case "fav" :
                return new FavouriteSongIterator(this);
            default:
                break;
        }

        return null;
    }
}
