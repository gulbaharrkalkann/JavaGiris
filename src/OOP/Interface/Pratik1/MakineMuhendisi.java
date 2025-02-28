package OOP.Interface.Pratik1;

public class MakineMuhendisi implements IMuhendis, ICalisma {
    @Override
    public void calis() {
        System.out.println("Makine Mühendisi Çalışıyor");
    }

    private boolean askerlik;
    private boolean adliSicil;
    public MakineMuhendisi(boolean askerlik,boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
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
    public void isTecrübesi(String[] array) {
if (array.length==0){
    System.out.println("Herhangi bir iş tecrübem bulunmuyor");
}else {
    System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım");
    for (int i=0;i< array.length;i++){
        System.out.println(array[i]);
    }
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
public void referansGetir(String[] array){
        if (array.length==0){
            System.out.println("Herhangi bir refeeransım bulunmuyor");
        }else {
            System.out.println("referanslarım");
            for (int i=0;i< array.length;i++){
                System.out.println(array[i]);
            }
        }
}


}
