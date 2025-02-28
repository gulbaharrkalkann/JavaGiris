package DesignPattern.Observer.Pratik1;

import java.util.ArrayList;
import java.util.List;

public class Twitter implements Observable {

    private List<Observer> observerList=new ArrayList<>();
    private final String mesaj="Bildirim geldi.";



    @Override
    public void notifyObserver() {
        for (Observer observer:observerList){
        observer.notify(mesaj);
        }
    }

    @Override
    public void addObserver(Observer o) {
observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
observerList.remove(o);
    }
}
