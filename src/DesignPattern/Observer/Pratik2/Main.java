package DesignPattern.Observer.Pratik2;

public class Main {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici("Kullanici1" , "Gül");
        Kullanici kullanici2 = new Kullanici("Kullanici2" , "Han");
        Kullanici kullanici3 = new Kullanici("Kullanici3" , "Sin");
        Kullanici kullanici4 = new Kullanici("Kullanici4" , "Cos");
        Sayfa sayfa = new Sayfa("SAYFA");

        kullanici1.takipciEkle(kullanici2);
        kullanici1.takipciEkle(kullanici3);
        sayfa.takipciEkle(kullanici4);
//        kullanici1.paylas(new Post("post1","gezi","30"));



    }
}
