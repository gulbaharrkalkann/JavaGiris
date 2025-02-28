package DesignPattern.Observer.Pratik7;

public class PhoneDisplay implements Observer{
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(int temprature) {
        System.out.println(name+" : Received temperature update "+temprature);
    }
}
