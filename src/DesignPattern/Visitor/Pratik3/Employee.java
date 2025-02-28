package DesignPattern.Visitor.Pratik3;
//Employee sınıfı temel çalışan bilgilerini tutar ve her tür çalışan için accept metodunu içerir
abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract void accept(Visitor visitor);
}
