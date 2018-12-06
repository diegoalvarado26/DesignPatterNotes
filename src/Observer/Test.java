package Observer;

public class Test {

    public static void main(String[] args){

        BookGrabber theGrabber = new BookGrabber();
        //Observers are added as soon as they are created.

        BookObserver obs1 = new BookObserver(theGrabber);
        BookObserver obs2 = new BookObserver(theGrabber);

        theGrabber.setBookName("The Wizard of Oz");
        theGrabber.setBookPrice(234.23);
        theGrabber.notifyObserver();

        theGrabber.unregister(obs1);
        theGrabber.unregister(obs2);
    }
}
