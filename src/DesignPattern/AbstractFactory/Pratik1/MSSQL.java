package DesignPattern.AbstractFactory.Pratik1;

public class MSSQL implements DB{
    @Override
    public void selectData() {
        System.out.println("MSSQL veri tabanından veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("MSSQL veri tabanına veri yazıldı");
    }
}
