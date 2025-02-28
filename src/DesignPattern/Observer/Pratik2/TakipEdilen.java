package DesignPattern.Observer.Pratik2;

import java.util.ArrayList;
import java.util.List;

public abstract class TakipEdilen {
    private String isim;
    private List<Takipci>takipciList;

    public TakipEdilen(String isim){

        takipciList=new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Takipci> getTakipciList() {
        return takipciList;
    }

    public void setTakipciList(List<Takipci> takipciList) {
        this.takipciList = takipciList;
    }
    public void takipciEkle(Takipci takipci){
        takipciList.add(takipci);
    }
    public void takipciCikar(Takipci takipci){
        takipciList.remove(takipci);
    }
    public void tumunuBilgilendir(Post post){

    }
    public abstract void paylas(Post post);
}
