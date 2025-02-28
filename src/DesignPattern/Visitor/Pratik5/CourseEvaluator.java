package DesignPattern.Visitor.Pratik5;

public class CourseEvaluator implements CourseVisitor{

    @Override
    public void visit(TheoreticalCourse theoreticalCourse) {
        double average= theoreticalCourse.getExamAvarage();
        System.out.println("Teorik Ders : "+theoreticalCourse.getCourseName());
        System.out.println("Sınav Ortalaması : "+average);
        System.out.println("Başarı Durumu : "+(average>= 60 ? "Başarılı" : "Başarısız"));
        System.out.println();
    }

    @Override
    public void visit(PracticalCourse practicalCourse) {
double finalScore=(practicalCourse.getExamAvarage()*0.6+ practicalCourse.getProjectScore()*0.4);
        System.out.println("Uygulamalı Ders: "+practicalCourse.getCourseName());
        System.out.println("Sınav Ortalaması : "+practicalCourse.getExamAvarage());
        System.out.println("Proje Puanı : "+practicalCourse.getProjectScore());
        System.out.println("Final Puanı : "+finalScore);
        System.out.println("Başarı Durumu : "+(finalScore>=70 ? "Başarılı":"Başarısız"));
        System.out.println();
    }

    @Override
    public void visit(SeminarCourse seminarCourse) {

        double fianlScore=(seminarCourse.getAttendanceRate()*0.5+seminarCourse.getPresentationScore()*0.5);
        System.out.println("Seminer : "+seminarCourse.getCourseName());
        System.out.println("Katılım Oranı : "+seminarCourse.getAttendanceRate());
        System.out.println("Sunum Puanı : "+seminarCourse.getPresentationScore());
        System.out.println("Final Puanı : "+fianlScore);
        System.out.println("Başarı Durumu : "+(fianlScore>=75 ? "Başarılı":"Başarısız"));
    }
}
