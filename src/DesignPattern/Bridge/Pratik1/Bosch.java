package DesignPattern.Bridge.Pratik1;

public class Bosch implements  IDispenser{
    @Override
    public Water hot(Water w) {
        w.setDegree(80);
        return w;
    }

    @Override
    public Water cold(Water w) {
w.setDegree(5);
        return w;
    }

    @Override
    public Water normal(Water w) {

        return w;
    }
}
