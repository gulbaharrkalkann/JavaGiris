package DesignPattern.AbstractFactory.Pratik2;

public class RedVegetableFactory extends VegetableFactory{
    @Override
    public Vegetable createOnion() {
        return new RedOnion("Kırmızı Soğan");
    }

    @Override
    public Vegetable createPepper() {
        return new RedPepper("Kırmızı Biber");
    }
}
