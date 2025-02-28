package DesignPattern.Observer.SinavSorusu;

import java.util.ArrayList;
import java.util.List;

public class Urun implements UrunInterface{
    private String ad;
    private double fiyat;
    private List<Kullanici> kullanicilar=new ArrayList<>();

    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    @Override
    public void teklifVer(Kullanici kullanici, double teklif) {
        if (teklif>fiyat){
            if (!kullanicilar.contains(kullanici)){
                kullanicilar.add(kullanici);
            }
            fiyat=teklif;
            System.out.println(teklif+" teklifi kabul edildi.");
            notifyKullanicilar(kullanici);
        }else {
            System.out.println(teklif+" teklifi reddedildi. Mevcut Fiyat : "+fiyat);

        }
    }
    private void notifyKullanicilar(Kullanici teklifVeren){
        for (Kullanici kullanici:kullanicilar){
            if (!kullanici.equals(teklifVeren)){
                kullanici.update(fiyat);
            }
        }
    }
}
