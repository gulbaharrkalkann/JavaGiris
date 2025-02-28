package DesignPattern.Builder.Pratik1;

public class Ogrenci {
    //zorunlu değişkenler
    private String ad;
    private String soyad;
    private String sinif;
    private String okulNo;
    //zorunlu olmayan değişkenler
    private boolean bisikletKulubuUyesiMi;
    private boolean kutuphaneKaydiVarMi;
    private int mezuniyetYili;
    private int basariSiralamasi;
    private int enDusukNotu;
    private int enYuksekNot;

    //öğrenci constructerı private yapıldı
    private Ogrenci(OgrenciBuilder ob) {
        this.bisikletKulubuUyesiMi = ob.bisikletKulubuUyesiMi;
        this.kutuphaneKaydiVarMi = ob.kutuphaneKaydiVarMi;
        this.okulNo = ob.okulNo;
        this.sinif = ob.sinif;
        this.soyad = ob.soyad;
        this.ad = ob.ad;
        this.mezuniyetYili = ob.mezuniyetYili;
        this.basariSiralamasi = ob.basariSiralamasi;
        this.enDusukNotu = ob.enDusukNotu;
        this.enYuksekNot = ob.enYuksekNot;
    }
public static class OgrenciBuilder {
        //Öğrenci sınıfıyla aynı değişkenlere sahiptir
    private String ad;
    private String soyad;
    private String sinif;
    private String okulNo;

    private boolean bisikletKulubuUyesiMi;
    private boolean kutuphaneKaydiVarMi;
    private int mezuniyetYili;
    private int basariSiralamasi;
    private int enDusukNotu;
    private int enYuksekNot;


    public OgrenciBuilder(String ad, String soyad, String sinif, String okulNo) {
        //Zorunlu olan değişkenler tanımlanır
        this.okulNo = okulNo;
        this.sinif = sinif;
        this.soyad = soyad;
        this.ad = ad;
    }
//zorunlu olmayan değişkenler setlenir.
    //değer olarak void değil öğrenci builder döndürür
    public OgrenciBuilder setBisikletKulubuUyesiMi(boolean bisikletKulubuUyesiMi) {
        this.bisikletKulubuUyesiMi = bisikletKulubuUyesiMi;
        return this;
    }

    public OgrenciBuilder setKutuphaneKaydiVarMi(boolean kutuphaneKaydiVarMi) {
        this.kutuphaneKaydiVarMi = kutuphaneKaydiVarMi;
        return this;
    }

    public OgrenciBuilder setMezuniyetYili(int mezuniyetYili) {
        this.mezuniyetYili = mezuniyetYili;
        return this;
    }

    public OgrenciBuilder setBasariSiralamasi(int basariSiralamasi) {
        this.basariSiralamasi = basariSiralamasi;
        return this;
    }

    public OgrenciBuilder setEnDusukNotu(int enDusukNotu) {
        this.enDusukNotu = enDusukNotu;
        return this;
    }

    public OgrenciBuilder setEnYuksekNot(int enYuksekNot) {
        this.enYuksekNot = enYuksekNot;
        return this;
    }

    public Ogrenci build() {
        return new Ogrenci(this);
    }
}
@Override
    public String toString(){
        return "Ogrenci DesignPattern.Builder\n{ "+
                "Öğrenci adi: "+ad+
                ", ÖğrenciSoyadı : "+soyad+
                ", Öğrenci numaras : "+okulNo+
                ", Öğrenci sınıfı : "+sinif+
                ", En yüksek notu : "+enYuksekNot+
                ", En düşük notu : "+enYuksekNot+
                ", Başarı Sıralaması : "+basariSiralamasi+
                ", Mezuniyet yılı : "+mezuniyetYili+
                ", Kütüphane kaydı : "+kutuphaneKaydiVarMi+
                ", bisiklet Kulübü Üyesi : "+bisikletKulubuUyesiMi;


    }
}



