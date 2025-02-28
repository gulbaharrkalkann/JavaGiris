package DesignPattern.Factory.Pratik2;

public class BankaFactory {

    public Banka bankaOlustur(String bankaAdi){
        if (bankaAdi.equals("Akbank")){
            return new Akbank();
        } else if (bankaAdi.equals("Ziraat")) {
            return new Ziraat();
        } else if (bankaAdi.equals("Vakif")) {
            return new Vakif();
        }else
            return null;
    }
}
