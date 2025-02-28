package DesignPattern.Composite.Pratik6;
//Leaf sınıfı tek bir yemek veya içeceği temsil eder
public class MenuItem implements MenuComponent{
    private String name;
    private double price;

    public MenuItem( String name,double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Item : "+name+" | Price : "+price+" $");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
