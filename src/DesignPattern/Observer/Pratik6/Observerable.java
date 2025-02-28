package DesignPattern.Observer.Pratik6;

import java.util.ArrayList;
import java.util.List;

public abstract class Observerable {
    private List<Observer>observerList;
    public Observerable(){
        observerList=new ArrayList<>();
    }
    public void ekle(Observer observer){
        observerList.add(observer);
    }
    public void cikar(Observer observer){
        observerList.remove(observer);
    }
    public void haberVer(){
        for (Observer observer:observerList){
            observer.update(this);
        }
    }
}
