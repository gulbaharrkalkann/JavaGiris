package DesignPattern.Observer.Pratik1;

public interface Observable {
    //Observable --> gözlenen,takip edilen
    //twitter fenomeni,youtube kanalı...

    void notifyObserver();
    void addObserver(Observer o);
    void removeObserver(Observer o);


}
