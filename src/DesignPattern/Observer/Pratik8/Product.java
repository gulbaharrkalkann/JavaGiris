package DesignPattern.Observer.Pratik8;

import java.util.ArrayList;
import java.util.List;

//ConcreteSubject Sınıfı
public class Product implements Subject{
    private List<Observer>observers=new ArrayList<>();
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
observers.remove(observer);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        System.out.println("Product stock updated : "+stock);
        if (stock>0){
            notifyObserver();
        }
    }

    @Override
    public void notifyObserver() {
for (Observer observer:observers){
    observer.update("Product : "+name+" is now in stock.Current stock : "+stock);

}

    }
}
