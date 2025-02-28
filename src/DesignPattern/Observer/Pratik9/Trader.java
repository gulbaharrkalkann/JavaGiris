package DesignPattern.Observer.Pratik9;

public class Trader implements Observer{
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Trader "+name+" : Received update - "+stockSymbol+" Price : "+price+" $");
        if (price<100){
            System.out.println("Trader "+name+" : Buying "+stockSymbol);
        }else {
            System.out.println("Trader "+name+" : Selling "+stockSymbol);
        }
    }
}
