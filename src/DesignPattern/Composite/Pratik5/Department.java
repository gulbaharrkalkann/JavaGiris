package DesignPattern.Composite.Pratik5;

import java.util.ArrayList;
import java.util.List;
//Composite : Bir departmanı veya bir grup çalışanı temsil eder
public class Department implements Employee{
    private String departmentName;
    private List<Employee> employees=new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public  void  removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Departman : "+departmentName);
        for (Employee employee:employees){
            employee.showDetails();
        }
    }
}
