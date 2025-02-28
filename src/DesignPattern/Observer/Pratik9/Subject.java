package DesignPattern.Observer.Pratik9;

public interface Subject {
    void addObserver(Observer observer);//Gözlemci ekle
    void removeObserver(Observer observer);//Gözlemci çıkar
    void notifyObserver(String stockSymbol,double price);//Gözlemcilere bildir

}
