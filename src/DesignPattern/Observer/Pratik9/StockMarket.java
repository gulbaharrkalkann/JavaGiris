package DesignPattern.Observer.Pratik9;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{
    private List<Observer>observers=new ArrayList<>();
    private String stockSymbol;
    private double price;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String stockSymbol, double price) {
    for (Observer observer:observers){
        observer.update(stockSymbol,price);
    }

    }
    public void updateStock(String stockSymbol,double price){
        this.stockSymbol=stockSymbol;
        this.price=price;
        System.out.println("StockMarket : Stock updated - "+stockSymbol+" Price : "+price+" $");
        notifyObserver(stockSymbol,price);
    }
}
