package DesignPattern.Visitor.Pratik3;

public interface Visitor {
    //Her çalışanın maaşını hesaplayacak olan calculateSalary metodunu tanımlıyoruz .Bu metodun her çalışananın türüne göre farklı implementasyonu olacak,
    void calculateSalary(Manager manager);
    void calculateSalary(Developer developer);
    void calculateSalary(Cleaner cleaner);
}
