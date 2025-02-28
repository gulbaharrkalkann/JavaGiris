package DesignPattern.Observer.Pratik2;

public class Sayfa extends TakipEdilen{
    public Sayfa (String isim){
        super(isim);
    }

    @Override
    public void paylas(Post post) {
        System.out.println(getIsim()+" sayfası "+post.getBaslik()+" paylaşti");
        tumunuBilgilendir(post);
    }
}
