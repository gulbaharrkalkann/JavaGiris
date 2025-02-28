package DesignPattern.Factory.Pratik2;

public class Akbank implements Banka{
    @Override
    public String bankaAdi() {
        return "Akbank";
    }

    @Override
    public double krediOrani() {
        return 2.3;
    }

    @Override
    public void krediHesapla() {
        System.out.println(bankaAdi()+"bankasının kredi oranı : "+krediOrani());
    }
}
