package DesignPattern.Factory.Pratik2;

public class Vakif implements  Banka{
    @Override
    public String bankaAdi() {
        return "Vakıfbank";
    }

    @Override
    public double krediOrani() {
        return 2.4;
    }

    @Override
    public void krediHesapla() {
        System.out.println(bankaAdi()+"bankasının kredi oranı : "+krediOrani());
    }
}
