package Iterator;

import java.util.*;

public class DiscJokey {

    public SongsOfThe70s songsOfThe70s;
    public SongsOfThe80s songsOfThe80s;
    public SongsOfThe90s songsOfThe90s;

    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;

    /*
    public DiscJokey(SongsOfThe70s songsOfThe70s, SongsOfThe80s songsOfThe80s, SongsOfThe90s songsOfThe90s){
        this.songsOfThe70s = songsOfThe70s;
        this.songsOfThe80s = songsOfThe80s;
        this.songsOfThe90s = songsOfThe90s;
    }
    */

    public DiscJokey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s){
        iter70sSongs = songsOfThe70s;
        iter80sSongs = songsOfThe80s;
        iter90sSongs = songsOfThe90s;
    }

    public void showTheSongs1(){

        //Printing the 70s ArrayList

        ArrayList al70s = songsOfThe70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for (int i = 0; i < al70s.size(); i++){
            SongInfo songInfo =(SongInfo) al70s.get(i);
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
            System.out.println(" ");

        }

        //Printing the 80s Array

        SongInfo[] al80s = songsOfThe80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for (int i = 0; i < al80s.length; i++){
            SongInfo songInfo = al80s[i];
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
            System.out.println(" ");

        }

        //Printing the 90s Hashtable
        Hashtable<Integer, SongInfo> al90s = songsOfThe90s.getBestSongs();
        System.out.println("Songs of the 90s \n");

        for (Enumeration<Integer> e = al90s.keys(); e.hasMoreElements();){
            SongInfo bestSongs = al90s.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
            System.out.println(" ");

        }
    }


    public void showTheSongs2(){
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);
        System.out.println(" ");

        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s);
        System.out.println(" ");

        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s);
        System.out.println(" ");

    }

    public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
            System.out.println(" ");


        }
    }
}
