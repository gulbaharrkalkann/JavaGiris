package DesignPattern.Visitor.Pratik5;

public interface CourseVisitor {
    void visit(TheoreticalCourse theoreticalCourse);
    void visit(PracticalCourse practicalCourse);
    void visit(SeminarCourse seminarCourse);
}
