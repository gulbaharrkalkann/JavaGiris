package DesignPattern.Adapter.Pratik2;

public class TelefonEEAAdapter implements ElektrikliEvAletleri{

    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakveCalistir() {
        return telefon.sarjEt();
    }
}
