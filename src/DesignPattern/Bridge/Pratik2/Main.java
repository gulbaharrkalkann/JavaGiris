package DesignPattern.Bridge.Pratik2;

public class Main {
    public static void main(String[] args) {
        Togg t10x= new T10X(new AnadoluKirmizisi());
        t10x.createCar();

        Togg t10f= new T10X(new GemlikMavisi());
        t10f.createCar();
    }
}
