package DesignPattern.Facade.Pratik2;

public class Televizyon {

    private int sesSeviyesi=10;
    private int kanalNumarasi=1;

    public void ac(){
        System.out.println("Televizyon açılıyor");
    }
    public void kapat(){
        System.out.println("Televizyon kapatiliyor");
    }
    public void sesAzalt(int sesSeviyesi){
        if (sesSeviyesi >0){
            sesSeviyesi--;
            System.out.println("Ses seviyesi azaltıldı : "+sesSeviyesi);
        }else {
            System.out.println("ses seviyesi en düşük durumda");
        }

    }
    public void sesArttır(int sesSeviyesi){
        sesSeviyesi++;
        System.out.println("Ses seviyesi arttırıldı: "+sesSeviyesi);
    }
    public void kanalAzalt(int kanalNumarasi){
        if (kanalNumarasi>1){
            kanalNumarasi--;
            System.out.println("Kanal numarası azaltılıyor.Yeni kanal numarası : "+kanalNumarasi);
        }

    }
    public void kanalArtir(int kanalNumarasi){
        kanalNumarasi++;
        System.out.println("Kanal numarası arttırılıyor.Yeni kanal numarası :"+kanalNumarasi);
    }
}
