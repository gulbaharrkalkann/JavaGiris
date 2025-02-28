package DesignPattern.Observer.Pratik9;

public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket=new StockMarket();

        //Gözlemcileri oluştur
        Trader trader=new Trader("Alice");
        Trader trader2=new Trader("Bob");
        AnalyticsSystem analyticsSystem=new AnalyticsSystem();
        NewsAgency newsAgency=new NewsAgency();

        //Gözlemcileri kaydet
        stockMarket.addObserver(trader);
        stockMarket.addObserver(trader2);
        stockMarket.addObserver(analyticsSystem);
        stockMarket.addObserver(newsAgency);

        //Hisse senedi fiyatlarını güncelle
        stockMarket.updateStock("AAPL",150);
        // Çıktı:
        // StockMarket: Stock updated - AAPL Price: $150
        // Trader Alice: Received update - AAPL Price: $150
        // Trader Alice: Selling AAPL
        // Trader Bob: Received update - AAPL Price: $150
        // Trader Bob: Selling AAPL
        // AnalyticsSystem: Analyzing AAPL Price: $150
        // NewsAgency: Breaking News - AAPL is now priced at $150

        stockMarket.updateStock("GOOG", 90);
        // Çıktı:
        // StockMarket: Stock updated - GOOG Price: $90
        // Trader Alice: Received update - GOOG Price: $90
        // Trader Alice: Buying GOOG
        // Trader Bob: Received update - GOOG Price: $90
        // Trader Bob: Buying GOOG
        // AnalyticsSystem: Analyzing GOOG Price: $90
        // NewsAgency: Breaking News - GOOG is now priced at $90
    }
}
