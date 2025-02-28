package DesignPattern.AbstractFactory.Pratik2;

public class Main {
    public static void main(String[] args) {


 VegetableFactory greenFactory=new GreenVegetableFactory();
 Vegetable greenOnion=greenFactory.createOnion();
 Vegetable greenPepper=greenFactory.createPepper();

        System.out.println("Green DesignPattern.Factory Ürünleri");
        System.out.println("Sebze : "+greenOnion.getName());
        System.out.println("Sebze : "+greenPepper.getName());


        VegetableFactory redFactory=new RedVegetableFactory();
        Vegetable redOnion=redFactory.createOnion();
        Vegetable redPepper=redFactory.createPepper();

        System.out.println("Red DesignPattern.Factory Ürünleri");
        System.out.println("Sebze : "+redOnion.getName());
        System.out.println("Sebze : "+redPepper.getName());







    }
}
