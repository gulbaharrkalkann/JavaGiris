package DesignPattern.AbstractFactory.Pratik1;

public class ORACLE implements DB{
    @Override
    public void selectData() {
        System.out.println("ORACLE  veri tabanından veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("ORACLE veri tabanına veri yazıldı.");
    }
}
