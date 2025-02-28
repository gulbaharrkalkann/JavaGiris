package DesignPattern.Adapter.Pratik2;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){

        int volt=elektrikliEvAletleri.prizeTakveCalistir();
        System.out.println("Prizden "+volt+ " volt alınıyor.");
    }

}
