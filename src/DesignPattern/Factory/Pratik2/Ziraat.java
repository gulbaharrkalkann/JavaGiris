package DesignPattern.Factory.Pratik2;

public class Ziraat implements Banka{
    @Override
    public String bankaAdi() {
        return "Ziraat Bankası";
    }

    @Override
    public double krediOrani() {
        return 2.1;
    }

    @Override
    public void krediHesapla() {
        System.out.println(bankaAdi()+"bankasının kredi orani : "+krediOrani());
    }
}
