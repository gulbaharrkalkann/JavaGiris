package OOP.İnheritance.Pratik3;

public abstract class Memur extends Calisan {
    private String departman;
    private String mesai;


    public Memur(String adSoyad,String telefon,String ePosta,String departman,String mesai){
        super(adSoyad, telefon, ePosta);
        this.mesai=mesai;
        this.departman=departman;

    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public void calis(){
        System.out.println(this.getAdSoyad()+ " memur görevlerini yapıyor.");
    }
    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+ " memur c kapısından giriş yaptı");
    }
}
