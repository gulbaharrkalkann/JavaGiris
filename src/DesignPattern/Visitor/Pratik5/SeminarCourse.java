package DesignPattern.Visitor.Pratik5;

public class SeminarCourse extends Course{
    private double attendanceRate;
    private double presentationScore;

    public SeminarCourse(String courseName, int studentCount, double attendanceRate, double presentationScore) {
        super(courseName, studentCount);
        this.attendanceRate = attendanceRate;
        this.presentationScore = presentationScore;
    }

    public double getAttendanceRate() {
        return attendanceRate;
    }

    public double getPresentationScore() {
        return presentationScore;
    }

    @Override
    public void accept(CourseVisitor visitor) {
        visitor.visit(this);
    }
}
