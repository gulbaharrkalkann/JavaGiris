package DesignPattern.Builder.Pratik1;
/*
1-statik inner sınıf bütün özellikleri taşıyan
2-builder sınıfında required özellikleri içeren public bir consructure
3-builder return eden set metodları
4-build metodu
 */
public class Main {
    public static void main(String[] args) {
        Ogrenci  o1=new Ogrenci.OgrenciBuilder("gül","Kalkan","3.","427649")
                .setEnYuksekNot(100)
                .setBasariSiralamasi(3)
                .setBisikletKulubuUyesiMi(false)
                .setEnDusukNotu(70)
                .setKutuphaneKaydiVarMi(true)
                .setMezuniyetYili(2026)
                .build();
        System.out.println(o1.toString());
    }
}
