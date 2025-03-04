package OOP.İnheritance.Pratik3;

public abstract class Akademisyen extends Calisan{

    private String bolum;
    private String unvan;



    public Akademisyen(String adSoyad,String telefon,String ePosta,String bolum,String unvan){
        super(adSoyad, telefon, ePosta);
        this.bolum=bolum;
        this.unvan=unvan;


    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public abstract void derseGir(String dersSaati);
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" akademisyeni A kapısından giriş yaptı");
    }
}

