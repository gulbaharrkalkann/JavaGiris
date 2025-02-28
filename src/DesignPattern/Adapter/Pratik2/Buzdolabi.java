package DesignPattern.Adapter.Pratik2;

public class Buzdolabi implements ElektrikliEvAletleri{

    private int volt;
    public Buzdolabi() {
        this.volt=220;
    }

    @Override
    public int prizeTakveCalistir() {
        System.out.println("Buzdolabı çalışıyor");
        return volt;
    }
}
