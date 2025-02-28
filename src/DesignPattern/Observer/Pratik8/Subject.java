package DesignPattern.Observer.Pratik8;

public interface Subject {
    void addObserver(Observer observer);//Gözlemci ekle
    void removeObserver(Observer observer);//Gözlemci çıkar
    void notifyObserver();//Gözlemcilere bildir
}
