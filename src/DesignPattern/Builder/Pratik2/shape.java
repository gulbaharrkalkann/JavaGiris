package DesignPattern.Builder.Pratik2;

public class shape {
    private int kenarSayisi;
    private String baslangicKonumu;
    private int kenarUzunluklari;
    private int kenarKalinligi;
    private String kenarRengi;
    private String icRengi;

    private shape(shapeBuilder sBuilder) {
        this.kenarSayisi = sBuilder.kenarSayisi;
        this.baslangicKonumu = sBuilder.baslangicKonumu;
        this.kenarUzunluklari = sBuilder.kenarUzunluklari;
        this.kenarKalinligi = sBuilder.kenarKalinligi;
        this.kenarRengi = sBuilder.kenarRengi;
        this.icRengi = sBuilder.icRengi;
    }
    public static class shapeBuilder {
        private int kenarSayisi;
        private String baslangicKonumu;
        private int kenarUzunluklari;
        private int kenarKalinligi;
        private String kenarRengi;
        private String icRengi;

        public shapeBuilder(int kenarSayisi, String baslangicKonumu, int kenarUzunluklari, int kenarKalinligi) {
            this.kenarSayisi = kenarSayisi;
            this.baslangicKonumu = baslangicKonumu;
            this.kenarUzunluklari = kenarUzunluklari;
            this.kenarKalinligi = kenarKalinligi;
        }
        public shapeBuilder setKenarRengi(String kenarRengi) {
            this.kenarRengi = kenarRengi;
            return this;
        }
        public shapeBuilder seticRengi(String icRengi) {
            this.icRengi = icRengi;
            return this;
        }
        public shape build() {
            return new shape(this);
        }

    }

    @Override
    public String toString() {
        return "shapeBuilder{" +
                "kenarSayisi=" + kenarSayisi +
                ", baslangicKonumu=" + baslangicKonumu +
                ", kenarUzunluklari=" + kenarUzunluklari +
                ", kenarKalinligi=" + kenarKalinligi +
                ", kenarRengi='" + kenarRengi + '\'' +
                ", icRengi='" + icRengi + '\'' +
                '}';
    }
}
