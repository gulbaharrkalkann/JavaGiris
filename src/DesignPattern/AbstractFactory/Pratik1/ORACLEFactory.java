package DesignPattern.AbstractFactory.Pratik1;

public class ORACLEFactory implements DBFactory{
    @Override
    public DB createDB() {
        return new ORACLE();
    }
}
