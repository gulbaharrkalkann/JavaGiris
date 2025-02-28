package DesignPattern.Composite.Pratik5;
//Leaf : tek bir çalışanı temsil eder ve sadece kendi bilgilerini gösterir
public class IndividualEmployee implements Employee{
    private String name;
    private String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(position+" : "+name);
    }
}
