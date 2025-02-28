package DesignPattern.Builder.Pratik2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        shape ucgen=new shape.shapeBuilder(3,"0.0",3,3).seticRengi("Kirmizi").build();
        shape kare=new shape.shapeBuilder(4,"5.0",3,3).seticRengi("Lacivert").seticRengi("Sari").build();
        System.out.println(ucgen.toString());
        System.out.println(kare.toString());
    }
}
