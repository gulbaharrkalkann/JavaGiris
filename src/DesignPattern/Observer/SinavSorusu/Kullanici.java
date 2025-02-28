package DesignPattern.Observer.SinavSorusu;

public class Kullanici implements Observer{
    private String ad;
    private String email;

    public Kullanici(String ad, String email) {
        this.ad = ad;
        this.email = email;
    }

    @Override
    public void update(double newPrice) {
        System.out.println(ad+" kullanıcısına fiyat değişimi ( "+newPrice+ " ) mail olarak bildirildi.");
    }

    public String getAd() {
        return ad;
    }
}
