package DesignPattern.Bridge.Pratik2;

public class T10X implements Togg{
    private Renk renk;

    public T10X(Renk renk) {
        this.renk = renk;
    }

    @Override
    public void createCar() {
        System.out.println("T10X oluşturuldu.");
        renk.drawColor();
    }
}
