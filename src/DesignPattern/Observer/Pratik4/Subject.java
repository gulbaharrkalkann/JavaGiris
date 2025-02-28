package DesignPattern.Observer.Pratik4;

public interface Subject {
    public void  register(Observer o);
    public void unREgister(Observer o);
    public void notifyObserver();

}
