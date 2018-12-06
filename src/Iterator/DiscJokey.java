package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class DiscJokey {

    public SongsOfThe70s songsOfThe70s;
    public SongsOfThe80s songsOfThe80s;
    public SongsOfThe90s songsOfThe90s;

    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;


    public DiscJokey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s){
        iter70sSongs = songsOfThe70s;
        iter80sSongs = songsOfThe80s;
        iter90sSongs = songsOfThe90s;
    }

    public void showTheSongs1(){

        ArrayList al70s = songsOfThe70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for (int i = 0; i < al70s.size(); i++){
        }
    }

    public void showTheSongs(){
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);

    }

    public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());

        }
    }
}
