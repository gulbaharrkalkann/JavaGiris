package DesignPattern.Visitor.Pratik5;

public class TheoreticalCourse extends Course{
    private double examAvarage;

    public TheoreticalCourse(String courseName, int studentCount, double examAvarage) {
        super(courseName, studentCount);
        this.examAvarage = examAvarage;
    }

    public double getExamAvarage() {
        return examAvarage;
    }

    @Override
    public void accept(CourseVisitor visitor) {
        visitor.visit(this);
    }
}
