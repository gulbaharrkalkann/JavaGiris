package DesignPattern.Observer.Pratik5;

public class Main {
    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        Student ahmet=new Student();
        teacher.addObserver(ahmet);
        teacher.enterClass();
        teacher.quitClass();
        teacher.enterClass();
    }
}
