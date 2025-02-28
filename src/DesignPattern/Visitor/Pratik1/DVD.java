package DesignPattern.Visitor.Pratik1;

public class DVD implements Element {
    private String title;
    private double price;

    public DVD(String title,double price) {
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
        visitor.visitDVD(this); // Ziyaretçiyi çağır ve `visitDVD` metodunu tetikle
    }
}

