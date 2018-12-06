package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {

    public SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOfThe80s(){
        bestSongs = new SongInfo[3];

        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Banarama", 1984);

    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    public SongInfo[] getBestSongs() {
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        //The iterator method ONLY works on ArrayList.
        //We convert the array to an ArrayList.

        return Arrays.asList(bestSongs).iterator();
    }

}
