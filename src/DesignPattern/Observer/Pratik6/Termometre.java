package DesignPattern.Observer.Pratik6;

import java.math.BigDecimal;

public class Termometre extends Observerable{
    private BigDecimal anlikSicaklil;
    private BigDecimal minSicaklik;
    private BigDecimal maxSicaklik;

    public Termometre( BigDecimal minSicaklik, BigDecimal maxSicaklik) {
        this.anlikSicaklil = BigDecimal.valueOf(24);
        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;
    }

    public BigDecimal getAnlikSicaklil() {
        return anlikSicaklil;
    }

    public void setAnlikSicaklil(BigDecimal anlikSicaklil) {
        this.anlikSicaklil = anlikSicaklil;
        System.out.println(anlikSicaklil);
        sicakligiKontrolEt();
    }
    private void sicakligiKontrolEt(){
      boolean isCokSicak=  anlikSicaklil.compareTo(maxSicaklik)>=0;
      boolean isCokSoguk=anlikSicaklil.compareTo(minSicaklik)<=0;

      if (isCokSicak||isCokSoguk){
haberVer();
      }
    }
}
