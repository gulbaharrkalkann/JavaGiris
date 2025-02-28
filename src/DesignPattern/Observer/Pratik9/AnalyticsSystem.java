package DesignPattern.Observer.Pratik9;

public class AnalyticsSystem implements Observer{
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("AnalyticsSystem :  Analyzing "+stockSymbol+"Price : "+price+" $");
    }
}
