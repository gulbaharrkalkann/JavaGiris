package DesignPattern.Visitor.Pratik5;

import java.util.ArrayList;
import java.util.List;

/*
Senaryo 2: Üniversite Ders Değerlendirme Sistemi
Bir üniversitede, her dönem derslerin başarı durumları değerlendirilmek isteniyor. Dersler şu şekilde sınıflandırılmıştır:

Teorik Ders: Sadece sınav notları üzerinden değerlendirilir.
Uygulamalı Ders: Sınav notlarına ek olarak proje çalışmaları da değerlendirmeye katılır.
Seminer: Katılım yüzdesine ve sunum performansına göre değerlendirilir.
Amaç:

Her ders türü için ayrı bir değerlendirme metodu uygulanır.
Toplam başarı oranı ve her ders türüne özel ortalama başarı puanı hesaplanır.
 */
public class Main {
    public static void main(String[] args) {

        //Ders listesini oluştur
        List<Course> courses=new ArrayList<>();
        courses.add(new TheoreticalCourse("Matematik",40,75));
        courses.add(new PracticalCourse("Programlama",30,85,90));
        courses.add(new SeminarCourse("Sunum Teknikleri",25,80,95));

        CourseEvaluator courseEvaluator=new CourseEvaluator();

        for (Course course:courses){
            course.accept(courseEvaluator);
        }
    }
}
