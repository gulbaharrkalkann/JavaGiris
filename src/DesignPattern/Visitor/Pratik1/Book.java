package DesignPattern.Visitor.Pratik1;

public class Book implements Element{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);//Ziyaretçiyi çağır ve visitBook metodunu tetikle
    }
}
