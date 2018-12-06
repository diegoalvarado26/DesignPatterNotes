package Iterator;

public class SongInfo {

    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearRelease){
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearRelease;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getBandName() {
        return bandName;
    }

    public String getSongName() {
        return songName;
    }
}
