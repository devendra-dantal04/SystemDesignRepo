package BehaviouralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FavouriteSongIterator implements PlaylistIterator{
    Playlist favouritePlaylist;
    Integer index;

    public FavouriteSongIterator(Playlist playlist) {
        this.favouritePlaylist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        ArrayList<String> favSongs = this.favouritePlaylist.getSongs().stream().filter(song -> song.contains("Fav")).collect(Collectors.toCollection(ArrayList::new));
        return index < favSongs.size();
    }

    @Override
    public String next() {
        ArrayList<String> favSongs = this.favouritePlaylist.getSongs().stream().filter(song -> song.contains("Fav")).collect(Collectors.toCollection(ArrayList::new));
        if(this.index < favSongs.size()) {
            return favSongs.get(this.index++);
        }else {
            return null;
        }
    }
}
