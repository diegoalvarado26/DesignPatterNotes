package Observer;

public class BookObserver implements Observer{
    //This are the people who want the price.

    private double bookPrice;
    private String bookName;

    private static int observerIDTracker = 0;
    //Keeps track of the instances of the class.

    private int observerID;

    private Subject bookGrabber;

    public BookObserver(Subject bookGrabber){
        this.bookGrabber = bookGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer created. ID: " + this.observerID);
        bookGrabber.register(this);
        //IMPORTANT. The this here refers to the instance
        //of the class itself.
    }
    @Override
    public void update(String bookName, double bookPrice) {

        this.bookName = bookName;
        this.bookPrice = bookPrice;

        printPriceAndBook();
    }

    public void printPriceAndBook(){
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Book price: " + this.bookPrice);
    }
}
