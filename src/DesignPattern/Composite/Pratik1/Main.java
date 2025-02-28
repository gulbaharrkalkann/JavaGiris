package DesignPattern.Composite.Pratik1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Urun domates=new Urun(BigDecimal.TEN,"Domates");
        Urun patates=new Urun(BigDecimal.ONE,"Patates");
        Urun sogan=new Urun(BigDecimal.ONE,"Soğan");

        Paket sebsePaketi=new Paket("Sebze Paketi");
        sebsePaketi.getUrunList().add(domates);
        sebsePaketi.getUrunList().add(patates);
        sebsePaketi.getUrunList().add(sogan);

        Urun sesSistemi=new Urun(BigDecimal.valueOf(5000),"Ses sistemi");
        Urun kulaklik=new Urun(BigDecimal.valueOf(1000),"Kulaklık");

        Paket teknolojiPaketi=new Paket("Teknoloji Paketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);

        Urun futbolTopu=new Urun(BigDecimal.valueOf(100)," Futbol Topu");

        Sepet sepet=new Sepet("Benim Sepetim");
        sepet.getFiyatlanabilirList().add(sebsePaketi);
        sepet.getFiyatlanabilirList().add(teknolojiPaketi);
        sepet.getFiyatlanabilirList().add(futbolTopu);


        Urun yag=new Urun(BigDecimal.valueOf(50),"Yağ");
        Kumanya kumanya=new Kumanya("Ramazan Kumanyası ");
        kumanya.getPaketList().add(sebsePaketi);
        kumanya.getUrunList().add(yag);

        BigDecimal toplamTutar=sepet.toplamDenecekTutar();
        System.out.println("Ödenecek Tutar = "+toplamTutar+" TL ");





    }
}
