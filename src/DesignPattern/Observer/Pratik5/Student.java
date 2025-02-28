package DesignPattern.Observer.Pratik5;

public class Student implements IObserver{

    public void enjoy(){
        System.out.println("Tenefüs vakti.");
    }
    public void listen(){
        System.out.println("Ders zamanı.");
    }
    @Override
    public void handle(ISubject subject) {
        Teacher teacher=(Teacher) subject;
        if (teacher.getIsExplaining()){
            listen();
        }else
            enjoy();
    }
}
