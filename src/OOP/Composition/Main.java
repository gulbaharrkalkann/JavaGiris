package OOP.Composition;

public class Main {
    public static void main(String[] args) {
Resolution resolution=new Resolution(1920,1080);
Monitor monitor=new Monitor("VS197DE","Asus","19,5",resolution);

Kasa kasa=new Kasa("Shadow Slade","Shadow","Temperli Cam");

Anakart anakart=new Anakart("B250-PRO","Asus",10,"Windows 10");

Bilgisyar pc=new Bilgisyar(monitor,kasa,anakart);
pc.getKasa().bilgisyariAc();
pc.getMonitor().monitoruKapat();
pc.getAnakart().isletimSisteminiYukle("Ubuntu 16.04");



    }
}
