package DesignPattern.Observer.Pratik7;

import java.util.ArrayList;
import java.util.List;
//Concrete Subject Sınıfı
public class WeatherStation implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private int temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add( observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove( observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(temperature);
        }

    }
    public void setTemperature(int temperature){
        this.temperature=temperature;
        System.out.println("WeatherStation : New temperature is "+temperature);
        notifyObservers();//GÖZLEMCİLERE BİLDİR
    }
}
