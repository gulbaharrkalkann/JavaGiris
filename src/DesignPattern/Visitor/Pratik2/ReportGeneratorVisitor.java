package DesignPattern.Visitor.Pratik2;

public class ReportGeneratorVisitor implements Visitor{
    @Override
    public void generateReport(IndividualCustomer individualCustomer) {
        System.out.println("Generating report for Individual Customer: " + individualCustomer.getName());
        System.out.println("Balance: " + individualCustomer.getBalance());
        if (individualCustomer.getBalance() > 1000) {
            System.out.println("Status: Premium Customer");
        } else {
            System.out.println("Status: Regular Customer");
        }
    }

    @Override
    public void generateReport(CorporateCustomer corporateCustomer) {
        System.out.println("Generating report for Corporate Customer: " + corporateCustomer.getCompanyName());
        System.out.println("Annual Revenue: " + corporateCustomer.getAnnualRevenue());
        if (corporateCustomer.getAnnualRevenue() > 5000000) {
            System.out.println("Status: VIP Corporate Customer");
        } else {
            System.out.println("Status: Regular Corporate Customer");
        }
    }
}
