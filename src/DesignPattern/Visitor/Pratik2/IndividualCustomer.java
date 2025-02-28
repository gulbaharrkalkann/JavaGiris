package DesignPattern.Visitor.Pratik2;

public class IndividualCustomer implements Customer{
    private String name;
    private double balance;

    public IndividualCustomer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.generateReport(this);
    }
}
