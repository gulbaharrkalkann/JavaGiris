package DesignPattern.Observer.Pratik1;

public class Main {
    public static void main(String[] args) {


        Kullanici kullanici1=new Kullanici();
        Kullanici kullanici2=new Kullanici();
        Kullanici kullanici3=new Kullanici();


        Twitter twitter=new Twitter();
        twitter.addObserver(kullanici1);
        twitter.addObserver(kullanici2);
        twitter.addObserver(kullanici3);


   twitter.removeObserver(kullanici1);
   twitter.notifyObserver();
    }

}
