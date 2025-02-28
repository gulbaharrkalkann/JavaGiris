package DesignPattern.Visitor.Pratik5;

public class PracticalCourse extends Course{
    private double examAvarage;
    private double projectScore;
    public PracticalCourse(String courseName,int studentCount,double examAvarage,double projectScore){
        super(courseName, studentCount);
        this.examAvarage=examAvarage;
        this.projectScore=projectScore;
    }
    public double getExamAvarage(){
        return examAvarage;
    }
    public double getProjectScore(){
        return projectScore;
    }
    @Override
    public void accept(CourseVisitor visitor){
        visitor.visit(this);
    }
}
