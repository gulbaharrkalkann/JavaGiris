package DesignPattern.Facade.Pratik2;

public class AkilliEvSistemi {
Isik isik;
Televizyon televizyon;
Klima klima;
Kapi kapi;
Supurge supurge;

 public AkilliEvSistemi(int isikAdedi,int odaSayisi){
     isik=new Isik(isikAdedi);
     televizyon=new Televizyon();
     klima=new Klima();
     kapi=new Kapi();
     supurge=new Supurge(odaSayisi);
 }
 public void isikAc(int numara){
     isik.ac(numara);
 }
 public void isikKapat(int numara){
     isik.kapat(numara);
 }
 public void tvAc(){
     televizyon.ac();
 }
 public void tvKapat(){
     televizyon.kapat();
 }
 public void tvSesAzalt(){
     televizyon.sesAzalt(10);
 }
 public void tvSesArttir(){
     televizyon.sesArttır(10);
 }
    public void tvKanalAzalt() {
        televizyon.kanalAzalt(2);
    }

    public void tvKanalArtir() {
        televizyon.kanalArtir(3);
    }

    public void klimaGuncelle(int sicaklik) {
        klima.guncelle(sicaklik);
    }

    public void klimaAc() {
        klima.ac();
    }

    public void klimaKapat() {
        klima.kapat();
    }

    public void kapiKilitle() {
        kapi.kilitle();
    }

    public void kilitAc() {
        kapi.kilitAc();
    }
}

