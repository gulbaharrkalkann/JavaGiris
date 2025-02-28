package DesignPattern.Visitor.Pratik3;

public class SalaryCalculator implements Visitor{

    @Override
    public void calculateSalary(Manager manager) {
        double salary= manager.getBaseSalary()+2000;
        System.out.println("Salary of Manager"+manager.getName()+" : "+salary+" $");
    }

    @Override
    public void calculateSalary(Developer developer) {
double salary=developer.getBaseSalary()+1500;
        System.out.println("Salary of Developer "+developer.getName()+ " : "+salary+" $");
    }

    @Override
    public void calculateSalary(Cleaner cleaner) {
        double salary=cleaner.getBaseSalary();
        System.out.println("Salary ofCleaner "+cleaner.getName()+" : "+salary+" $");

    }
}
