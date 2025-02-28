package DesignPattern.Adapter.Pratik2;

public class Samsung implements Telefon{

    private int calismaVoltaji;

    public Samsung() {
        calismaVoltaji=5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon çalışıyor");
        return calismaVoltaji;
    }
}
