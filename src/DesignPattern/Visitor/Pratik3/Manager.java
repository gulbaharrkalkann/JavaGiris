package DesignPattern.Visitor.Pratik3;

public class Manager extends Employee{

    public Manager(String name,double baseSalary){
        super(name, baseSalary);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.calculateSalary(this);
    }
}
