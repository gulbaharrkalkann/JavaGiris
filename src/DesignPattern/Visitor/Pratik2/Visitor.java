package DesignPattern.Visitor.Pratik2;

public interface Visitor {
    void generateReport(IndividualCustomer individualCustomer);
    void generateReport(CorporateCustomer corporateCustomer);
}
