package DesignPattern.Observer.Pratik10;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String courseName, String topic) {
        //Öğrenciye bildirim gönder
        System.out.println("Student "+name+" notified : New course added -"+courseName);
    }
}
