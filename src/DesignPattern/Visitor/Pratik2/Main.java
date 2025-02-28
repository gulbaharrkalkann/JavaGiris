package DesignPattern.Visitor.Pratik2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Müşterileri oluştur
        List<Customer> customers=new ArrayList<>();
        customers.add(new IndividualCustomer("John Doe",1200.0));
        customers.add(new IndividualCustomer("Jane Smith",800));
        customers.add(new CorporateCustomer("TechCorp",6000000.0));
        customers.add(new CorporateCustomer("SmallBiz",200000.0));

        //REportGeneratorVisitor oluştur

        ReportGeneratorVisitor reportGenerator=new ReportGeneratorVisitor();

        //Müşteriler için raporları oluştur
        for (Customer customer:customers){
            customer.accept(reportGenerator);
            System.out.println("------------------------------------");
        }
    }
}
