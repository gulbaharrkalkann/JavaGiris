package DesignPattern.Visitor.Pratik1;

public class PriceCalculatorVisitor implements Visitor{
    private double totalPrice=0.0;

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visitBook(Book book) {
        totalPrice+= book.getPrice();
        System.out.println("Added Book : "+book.getTitle()+" - Price : "+book.getPrice()+" $");

    }

    @Override
    public void visitDVD(DVD dvd) {
totalPrice +=dvd.getPrice();
        System.out.println("Added DVD : "+dvd.getTitle()+" - Price : "+dvd.getPrice()+" $");
    }
}
