package DesignPattern.Composite.Pratik1;

import java.math.BigDecimal;

public class Urun implements Fiyatlanabilir{

    private String ad;
    private BigDecimal fiyat;

    public Urun(BigDecimal fiyat, String ad) {
        this.fiyat = fiyat;
        this.ad = ad;
    }

    @Override
    public BigDecimal getFiyat() {
        return this.fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }
}
