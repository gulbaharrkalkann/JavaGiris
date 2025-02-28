package DesignPattern.Bridge.Pratik2;

public class T10F implements Togg{
    private Renk renk;

    public T10F(Renk renk) {
        this.renk = renk;
    }

    @Override
    public void createCar() {
        System.out.println("T10F oluşturuldu.");
        renk.drawColor();
    }
}
