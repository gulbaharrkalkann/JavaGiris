package DesignPattern.Factory.Pratik2;

public class Main {
    public static void main(String[] args) {


        BankaFactory bankaFactory=new BankaFactory();

        Banka banka=bankaFactory.bankaOlustur("Vakif");
        banka.krediHesapla();



    }
}
