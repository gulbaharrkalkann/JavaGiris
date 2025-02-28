package DesignPattern.Observer.Pratik10;

public class Instructor implements Observer{
    private String name;

    public Instructor(String name) {
        this.name = name;
    }
    public void update(String courseName, String topic) {
        // Öğretim görevlisine bildirimi gönder
        System.out.println("Instructor " + name + " notified: New course added - " + courseName + " (Topic: " + topic + ")");
    }
}
