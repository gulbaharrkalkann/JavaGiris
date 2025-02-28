package DesignPattern.Factory.Pratik1;

public class MySql implements DB{
    @Override
    public void selectData() {
        System.out.println("MYSQL veri tabanından veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("MYSQL veri tabanına veri yazıldı");
    }
}
