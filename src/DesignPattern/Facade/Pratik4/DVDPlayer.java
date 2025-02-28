package DesignPattern.Facade.Pratik4;

public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player is On");
    }
    public void off(){
        System.out.println("DVD Player is Off");
    }
    public void play(String movie){
        System.out.println("Playing Movie : "+movie);
    }
}
