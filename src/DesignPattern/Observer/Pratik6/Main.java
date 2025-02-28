package DesignPattern.Observer.Pratik6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

       BigDecimal minSicaklik= BigDecimal.valueOf(23);
       BigDecimal maxSicaklik=BigDecimal.valueOf(28);

       Termometre termometre=new Termometre(minSicaklik,maxSicaklik);

       Ebeveyn anne=new Ebeveyn("Anne");
       Ebeveyn baba=new Ebeveyn("Baba");

       termometre.ekle(anne);
       termometre.ekle(baba);

       for (int i=termometre.getAnlikSicaklil().intValue();i<=30;i++){
           termometre.setAnlikSicaklil(BigDecimal.valueOf(i));
       }


        for (int i=termometre.getAnlikSicaklil().intValue();i>=22;i--){
            termometre.setAnlikSicaklil(BigDecimal.valueOf(i));
        }




    }
}
