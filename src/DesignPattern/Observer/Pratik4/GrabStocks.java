package DesignPattern.Observer.Pratik4;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber=new StockGrabber();

        StockObserver observer1=new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);
    }
}
