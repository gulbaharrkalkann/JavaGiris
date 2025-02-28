package DesignPattern.Observer.Pratik2;

public class Kullanici extends TakipEdilen implements Takipci {
    private String isim;
    private String mail;

    public Kullanici(String isim,  String mail) {
        super(isim);
        this.isim = isim;
        this.mail = mail;
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public void paylas(Post post){
        System.out.println(getIsim()+" kullanıcı ");
        tumunuBilgilendir(post);
    }


    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim()+"KULLANICI");
    }
}
