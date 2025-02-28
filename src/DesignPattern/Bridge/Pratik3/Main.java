package DesignPattern.Bridge.Pratik3;

public class Main {
    public static void main(String[] args) {

        Muzik muzik=new Muzik("sezen aksu -Gülümse","gülümse");
Bilgisayar bilgisayar=new Bilgisayar();
bilgisayar.muzikCal(muzik);

    }
}
