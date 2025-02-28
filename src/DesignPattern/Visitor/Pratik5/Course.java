package DesignPattern.Visitor.Pratik5;
//Bu sınıf tüm derslerin ortak özellikleri ve accept metotunu içerir
public  abstract class Course {
    private String courseName;
    private int studentCount;

    public Course(String courseName, int studentCount) {
        this.courseName = courseName;
        this.studentCount = studentCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    //Visitor ı kabul eden soyut metot

    public abstract void accept(CourseVisitor visitor);
}
