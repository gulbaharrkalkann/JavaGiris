package DesignPattern.Observer.Pratik10;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String courseName,String topic);
}
