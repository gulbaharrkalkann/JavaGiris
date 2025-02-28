package DesignPattern.Observer.Pratik4;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers=new ArrayList<Observer>();
    }
    @Override
    public void register(Observer newObserver) {
observers.add(newObserver);
    }

    @Override
    public void unREgister(Observer deleteObserver) {
int observerIndex=observers.indexOf(deleteObserver);
        System.out.println("Observer"+(observerIndex+1)+" deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
for (Observer observer:observers){
    observer.update(ibmPrice,aaplPrice,googPrice);
}
    }
    public void setIbmPrice(double newIbmPrice ){
        this.ibmPrice=newIbmPrice;
        notifyObserver();
    }
    public void setGoogPrice(double newGoogPrice ){
        this.googPrice=newGoogPrice;
        notifyObserver();
    }
    public void setAaplPrice(double newAaaplPrice ){
        this.aaplPrice=newAaaplPrice;
        notifyObserver();
    }
}
