package DesignPattern.Facade.Pratik2;

public class Supurge {
    private int odaSayisi;

    public Supurge(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
    public void temizle(int numara){
        System.out.println(numara+" numaralı oda temizleniyor.");

    }
}
