package array.ArrayList;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String >sarkici_listesi=new ArrayList<String>();
    public void sarkicilariBastir(){
        System.out.println("Şarkıcı listesinde "+sarkici_listesi.size()+ " kadar şarkıcı var");
        for (int i=0;i<sarkici_listesi.size();i++){
            System.out.println((i+1)+ " Şarkıcı : "+sarkici_listesi.get(i));

        }

    }
    public void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }
    public void sarkiciGuncelle(String yeniİsim,int pozisyon){
        sarkici_listesi.set(pozisyon,yeniİsim);
    }
    public void sarkiciSil(int pozisyon){
        String isim=sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + " isimli şarkıcı listeden silindi");
    }
    public void sarkiciAra(String sarkiciİsmi){
        int pozisyon=sarkici_listesi.indexOf(sarkiciİsmi);
        if (pozisyon>=0){
            System.out.println("şarkıcı bulundu");
            System.out.println(sarkiciİsmi+" isimli şarkıcı" +(pozisyon+1)+". pozisyonda");

        }else {
            System.out.println("şarkıcı bulunamadı.");
        }
    }
}
