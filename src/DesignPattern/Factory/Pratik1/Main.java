package DesignPattern.Factory.Pratik1;

public class Main {
    public static void main(String[] args) {


        DBFactory dbFactory=new DBFactory();
        DB mysql= dbFactory.getDB(1);
        DB oracle= dbFactory.getDB(2);
        DB mssql= dbFactory.getDB(3);

        mysql.selectData();mysql.insertData();
        mssql.selectData();mssql.insertData();
        oracle.selectData();oracle.insertData();



    }
}
