package DesignPattern.Factory.Pratik1;

public class Oracle implements DB{
    @Override
    public void selectData() {
        System.out.println("ORACLE veri tabanından veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("ORACLE veri tabanına veri yazıldı");
    }
}
