package DesignPattern.Visitor.Pratik1;

public class Main {
    public static void main(String[] args) {

        //Alışveriş sepetini oluştur
        ShoppingCart cart=new ShoppingCart();

        //Sepete ürünler ekle
        cart.addItem(new Book("DEsign Pattern",50.0));
        cart.addItem(new Book("Clean code",45.0));
        cart.addItem(new DVD("İnception",30.0));
        cart.addItem(new DVD("Interstellar",35.0));

        //Ziyaretçiyi oluştur
        PriceCalculatorVisitor priceCalculator=new PriceCalculatorVisitor();

        //Ziyaretçiyi alışveriş sepetine yönlendir
        cart.accept(priceCalculator);

        //Toplam fiyatı yazdır
        System.out.println("Total Price : "+priceCalculator.getTotalPrice()+" $");


    }
}
