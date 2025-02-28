package DesignPattern.Observer.Pratik7;

public interface Subject {
    void addObserver(Observer observer);// GÖZLEMCİ EKLE
    void removeObserver(Observer observer); //GÖZLEMCİ ÇIKAR
    void notifyObservers(); //GÖZLEMCİLERE BİLDİR

}
