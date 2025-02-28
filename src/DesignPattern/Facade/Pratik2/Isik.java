package DesignPattern.Facade.Pratik2;
/*
Isik sınıfı, bir evdeki ışıkları temsil eder.
Her ışığın açık mı, kapalı mı olduğunu bir boolean[] dizisi ile tutar.
boolean veri tipi: true ışık açık, false ışık kapalı anlamına gelir.
durum Özelliği:
durum adında bir boolean dizisi tanımlanır. Bu dizi, evdeki ışıkların durumunu saklar.
Örneğin, 3 ışık için [true, false, true] şu anlama gelir:
ışık: açık (true)
ışık: kapalı (false)
ışık: açık (true)
Kurucu Metot (Isik(int adet)):
Sınıf bir nesne olarak oluşturulurken, adet parametresi ile kaç ışık olacağı belirtilir.
boolean[] durum dizisi bu adet kadar boyutlandırılır.
Varsayılan olarak, dizinin tüm elemanları false (kapalı) olarak başlar.

 */
public class Isik {
    private boolean[] durum;

    public Isik(int adet){
        durum=new boolean[adet];
    }
public void ac(int numara){
        if (numara>=0 && numara< durum.length){
            durum[numara]=true;
            System.out.println(numara+" numaralı ışık açıldı");

        }else {
            System.out.println("Geçersiz ışık numarası.");
        }
}
public void kapat(int numara){
        if (numara>=0&&numara< durum.length){
            durum[numara]=false;
            System.out.println(numara+" numaralı ışık kapatıldı");
        }else {
            System.out.println("Geçersiz ışık numarası.");
        }
}
/*
Amaç: Toplam ışık sayısını öğrenmek.
Dönüş Değeri:
durum dizisinin uzunluğu, yani toplam ışık sayısını döner.
 */
public int getAdet(){
        return durum.length;
}
}
