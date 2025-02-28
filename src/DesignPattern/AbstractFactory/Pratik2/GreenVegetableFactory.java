package DesignPattern.AbstractFactory.Pratik2;

public class GreenVegetableFactory extends VegetableFactory{
    @Override
    public Vegetable createOnion() {
        return new GreenOnion("Yeşil Soğan");
    }

    @Override
    public Vegetable createPepper() {
        return new GreenPepper("Yeşil Biber");
    }
}
