package Iterator;

public class RadioStation {
    //Test class

    public static void main(String[] args){

        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DiscJokey madMike1 = new DiscJokey(songs70s, songs80s, songs90s);

        madMike1.showTheSongs2();


    }
}
