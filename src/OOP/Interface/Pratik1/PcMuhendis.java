package OOP.Interface.Pratik1;

public class PcMuhendis implements IMuhendis {
    private boolean askerlik;
    private boolean adliSicil;
    public PcMuhendis(boolean askerlik,boolean adliSicil){
        this.askerlik=askerlik;
        this.adliSicil=adliSicil;
    }
    @Override
    public void askerlikDurumuSorgula() {
if (askerlik){
    System.out.println("Askerliğimi yaptım");
}else {
    System.out.println("Askerliğimi henüz yapmadım");
}
    }

    @Override
    public String mezuniyetOrtalaması(double derece) {

        return "Ortalamam : "+derece;
    }

    @Override
    public void adliSicilSorgula() {
if (adliSicil){
    System.out.println("Adli sicil kaydım bulunuyor");
}else {
    System.out.println("Adli sicil kaydım bulunmamaktadır");
}
    }

    @Override
    public void isTecrübesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
