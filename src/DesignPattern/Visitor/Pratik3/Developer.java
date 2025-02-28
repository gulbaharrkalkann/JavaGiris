package DesignPattern.Visitor.Pratik3;

public class Developer extends Employee {

    public Developer(String name,double baseSalary){
        super(name,baseSalary);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculateSalary(this);
    }
}
