package DesignPattern.Observer.Pratik9;

public class NewsAgency implements Observer{
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("NewsAgency : Breaking News - "+stockSymbol+"is now priced at"+price+" $");
    }
}
