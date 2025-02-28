package DesignPattern.Observer.Pratik10;

import java.util.ArrayList;
import java.util.List;

public class OnlineCoursePlatform implements Subject{
    private List<Observer>observers;

    public OnlineCoursePlatform() {
        this.observers = new ArrayList<>();//Başlangıçta boş bir gözlemci listesi
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
observers.remove(observer);
    }

    @Override
    public void notifyObservers(String courseName, String topic) {
for (Observer observer:observers){
    observer.update(courseName,topic);//Her gözlemciye bildirim gönderir
}
    }
    public void addCourse(String courseName,String topic){
        System.out.println("New course added : "+courseName+ "-Topic : "+topic);
        notifyObservers(courseName, topic);//Yeni ders eklendiğinde gözlemcileri bilgilendirir
    }



    }

