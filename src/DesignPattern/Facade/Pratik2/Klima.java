package DesignPattern.Facade.Pratik2;

public class Klima {
    private int sicaklik;



    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }
    public void guncelle(int sicaklik){
this.sicaklik=sicaklik;
        System.out.println("Klima sıcaklığı güncellendi: "+sicaklik);
    }
    public void ac(){
        System.out.println("Klima açıldı.");
    }
    public void kapat(){
        System.out.println("Klima kapatılıyor.");
    }
}
