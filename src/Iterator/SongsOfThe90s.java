package Iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{

    HashMap<Integer, SongInfo> bestSongs = new HashMap<Integer, SongInfo>();
    public int hashKey = 0;

    public SongsOfThe90s(){

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);

    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    public HashMap<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
