package Observer;

import java.util.ArrayList;

public class BookGrabber implements Subject {
    //The mechanism through which observers (clients)
    //will get notified of book price changes.

    private ArrayList<Observer> clients = new ArrayList<Observer>();
    private String bookName;
    private double bookPrice;

    @Override
    public void register(Observer o) {
        //Adds any new clients.
        clients.add(o);
        System.out.println("Client N° " + (clients.indexOf(o) +1) + " added successfully.");
    }

    @Override
    public void unregister(Observer o) {
        //Deletes observer

        int observerIndex = clients.indexOf(o) + 1;

        System.out.println("Client N° " + (observerIndex + 1) + " deleted successfully." );
        clients.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {

        for (Observer e : clients){
            e.update( bookName, bookPrice);
        }
    }

    public void setBookPrice(double newBookPrice){
        bookPrice = newBookPrice;
    }

    public void setBookName(String newBookName){
        bookName = newBookName;
    }
}
