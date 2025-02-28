package DesignPattern.Composite.Pratik5;

import DesignPattern.Visitor.Pratik2.IndividualCustomer;

/*
bir Organizasyon Şeması senaryosu yazabiliriz. Bu senaryoda:

Component: Tüm çalışanlar için ortak bir arayüzdür.
Leaf: Tek bir çalışanı temsil eder (örneğin, bir mühendis).
Composite: Bir departmanı veya bir grup çalışanı temsil eder.
 */
public class Main {
    public static void main(String[] args) {

        //Bireysel çalışanlar oluştur
        IndividualEmployee emp1=new IndividualEmployee("Alice","Software Engineer");
        IndividualEmployee emp2=new IndividualEmployee("Bob","Quality Analyst");
        IndividualEmployee emp3=new IndividualEmployee("Charlie","DevOps Engineer");
       IndividualEmployee emp4=new IndividualEmployee("Diana","Product Manager");

       //Yazılım departmanını oluştur ve çalışanları ekle
        Department softwareDepartment=new Department("Software Department");
        softwareDepartment.addEmployee(emp1);
        softwareDepartment.addEmployee(emp2);
        softwareDepartment.addEmployee(emp3);

        //Ürün yönetimi departmanını oluştur ve çalışanları ekle
        Department productManagerDepartment=new Department("Product Manager");
        productManagerDepartment.addEmployee(emp4);

        //Şirket ana departmanını oluştur ve alt departmanları ekel

        Department company=new Department("Company");
        company.addEmployee(softwareDepartment);
        company.addEmployee(productManagerDepartment);

        //Organizasyon şemasını göster
        company.showDetails();


    }
}
