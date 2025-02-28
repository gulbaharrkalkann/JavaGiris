package DesignPattern.Visitor.Pratik3;

public class Cleaner extends Employee{

    public Cleaner(String name,double baseSalary){
        super(name, baseSalary);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.calculateSalary(this);
    }
}
