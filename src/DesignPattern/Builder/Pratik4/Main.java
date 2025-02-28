package DesignPattern.Builder.Pratik4;

public class Main {
    public static void main(String[] args) {
House house=new House.HouseBuilder("Mersin","Toroslar")
        .setHasTerrace(true)
        .setHasPool(false)
        .setHasPark(true).build();

        System.out.println(house.toString());
    }
}
