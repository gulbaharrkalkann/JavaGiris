package DesignPattern.Visitor.Pratik2;

public class CorporateCustomer implements Customer{
    private String companyName;
    private double annualRevenue;

    public CorporateCustomer(String companyName, double annualRevenue) {
        this.companyName = companyName;
        this.annualRevenue = annualRevenue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.generateReport(this);
    }
}
