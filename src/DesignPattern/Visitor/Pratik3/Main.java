package DesignPattern.Visitor.Pratik3;

import java.util.ArrayList;
import java.util.List;

/*
Senaryo: Çalışan Maaş Hesaplama Sistemi
Bir şirketin çalışanları var. Her çalışan, farklı türde bir iş pozisyonuna sahip olabilir. Bu iş pozisyonlarına göre maaş hesaplamaları değişir. Örneğin:

Yönetici pozisyonundaki bir çalışanın maaşı, standart çalışan maaşına ek olarak yönetici bonusu alır.
Yazılım geliştirici pozisyonundaki bir çalışan ise, maaşına ek olarak projelerden elde edilen primleri alır.
Temizlik personeli maaşı ise sadece sabit bir ücretle belirlenir.
Bu senaryoda, Visitor tasarım deseni kullanarak her bir çalışanın maaşını hesaplayacağız. Visitor deseni ile her bir çalışan türü için maaş hesaplama işlemi yapılacak.


 */
public class Main {
    public static void main(String[] args) {


        //Çalışanları oluştur
        List<Employee> employees=new ArrayList<>();
        employees.add(new Manager("John",5000));
        employees.add(new Developer("Alice",4000));
        employees.add(new Cleaner("Bob",2000));

        //SalaryCalculator sınıfını oluştur

        SalaryCalculator salaryCalculator=new SalaryCalculator();
        //Çalışanlar için maaş hesaplama işlemi

        for (Employee employee:employees){
            employee.accept(salaryCalculator);
        }
    }
}
