package OOP.İnheritance.Pratik1;

public class Kopek extends Hayvan {
    private int disSayisi;
    public Kopek(String isim,int kilo,int boy,int bacakSayisi,int disSayisi){
        super(isim,kilo,boy,bacakSayisi);
        this.disSayisi=disSayisi;
    }
    public void kos(int hiz){
        System.out.println("Köpek koşuyor");
        super.hareketeGec(hiz);
hareketeGec(hiz);
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }

    @Override
    public void hareketeGec(int hiz) {
        System.out.println("Köpek "+hiz+ "ile hareket ediyor");
        super.hareketeGec(hiz);
    }
}
