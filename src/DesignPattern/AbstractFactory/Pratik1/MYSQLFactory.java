package DesignPattern.AbstractFactory.Pratik1;

public class MYSQLFactory implements DBFactory{
    @Override
    public DB createDB() {
        return new MYSQL();
    }
}
