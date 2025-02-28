package DesignPattern.Builder.Pratik3;

public class Starbucks {

    //gerekli
    private String kahveBoyutu;
    //seçime göre değişir
    private String laktozsuzSutMiktari;
    private String yumusatici;

    private Starbucks(StarbucksBuilder sb) {
        this.kahveBoyutu = sb.kahveBoyutu;
        this.laktozsuzSutMiktari = sb.laktozsuzSutMiktari;
        this.yumusatici = sb.yumusatici;
    }
    public static class StarbucksBuilder{
        private String kahveBoyutu;

        private String laktozsuzSutMiktari;
        private String yumusatici;

        public StarbucksBuilder(String kahveBoyutu){
            this.kahveBoyutu=kahveBoyutu;
        }

        public StarbucksBuilder setYumusatici(String yumusatici) {
            this.yumusatici = yumusatici;
            return this;
        }

        public StarbucksBuilder setLaktozsuzSutMiktari(String laktozsuzSutMiktari) {
            this.laktozsuzSutMiktari = laktozsuzSutMiktari;
            return this;
        }

        public Starbucks build(){
            return new Starbucks(this);
        }
    }

}




