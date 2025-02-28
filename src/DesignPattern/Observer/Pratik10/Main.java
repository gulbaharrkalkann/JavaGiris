package DesignPattern.Observer.Pratik10;

public class Main {
    public static void main(String[] args) {
//1. Online ders platformunu oluştur
        OnlineCoursePlatform onlineCoursePlatform=new OnlineCoursePlatform();

        //2. Öğrencileri oluştur
        Student student1=new Student("Alice");
        Student student2=new Student("Bob");

        //3.Öğretim görevlilerini oluştur
        Instructor instructor1=new Instructor("Dr. Smith");
        Instructor instructor2=new Instructor("Prof. Johnson");

        //4.Gözlemcileri platforma ekle
        onlineCoursePlatform.addObserver(student1);
        onlineCoursePlatform.addObserver(student2);
        onlineCoursePlatform.addObserver(instructor1);
        onlineCoursePlatform.addObserver(instructor2);

        //5.Yeni dersler ekle
        onlineCoursePlatform.addCourse("Java programming","Object Oriented Concepts");
        onlineCoursePlatform.addCourse("Data Structures","Advenced Algorithms");

        //Bir gözlemciyi kaldır
        onlineCoursePlatform.removeObserver(student2);

        //7.Yeni bir ders ekle
        onlineCoursePlatform.addCourse("Web Development","HTML,CSS,JavaScript");

    }
}
