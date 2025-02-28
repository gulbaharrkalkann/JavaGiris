package DesignPattern.Factory.Pratik1;

public class MsSql implements DB{
    @Override
    public void selectData() {
        System.out.println("MSSQL veri tabanına veri okundu");
    }

    @Override
    public void insertData() {
        System.out.println("MSSQL veri tabanına veri yazıldı.");
    }
}
