package OOP.İnheritance.Pratik3;

public class Asistan extends Akademisyen{
    private int ofisSaati;
    public Asistan(String adSoyad,String telefon,String ePosta,String bolum,String unvan,int ofisSaati){
        super(adSoyad, telefon, ePosta, bolum, unvan);
        this.ofisSaati=ofisSaati;

    }

    public int getOfisSaati() {
        return ofisSaati;
    }
    public void setOfisSaati(){
        this.ofisSaati=ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad()+" quiz yapacaktır.");
    }

    @Override
    public void derseGir(String dersSaati) {
        System.out.println(this.getAdSoyad()+"asistanı"+dersSaati+"giriş yaptı");
    }
}
