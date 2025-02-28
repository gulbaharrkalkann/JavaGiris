package DesignPattern.AbstractFactory.Pratik1;

public class MYSQL implements DB{
    @Override
    public void selectData() {
        System.out.println("MYSQL veri tabanından veri okundu.");
    }

    @Override
    public void insertData() {
        System.out.println("MYSQL veri tabanına veri yazıldı.");
    }
}
