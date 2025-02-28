package DesignPattern.Bridge.Pratik1;

public class Erikli implements ICarboy{
    @Override
    public Water flow() {
        return new Water();
    }
}
