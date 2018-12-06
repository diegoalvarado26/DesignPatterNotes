package Observer;

public interface Subject {

    //All subjects (OOP term) are instantiated through this.

    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();

}
