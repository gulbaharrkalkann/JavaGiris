package DesignPattern.Observer.SinavSorusu;

public class Main {
    public static void main(String[] args) {
        Kullanici Gul=new Kullanici("Gül Kalkan","gul@ktu.edu");
        Kullanici Seyithan=new Kullanici("Seyithan","seysey@ktu.edu");

        Urun bilgisyar=new Urun("Bilgisyar",100);
        System.out.println("1. Teklif");
        bilgisyar.teklifVer(Gul,50);
        System.out.println("2. Teklif");
        bilgisyar.teklifVer(Seyithan,150);
        System.out.println("3. Teklif");
        bilgisyar.teklifVer(Gul,200);
        System.out.println("4. Teklif");
        bilgisyar.teklifVer(Seyithan,250);
    }
}
