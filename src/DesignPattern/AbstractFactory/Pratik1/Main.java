package DesignPattern.AbstractFactory.Pratik1;

public class Main {
    public static void main(String[] args) {

        DBFactory mysqlFactory=new MYSQLFactory();
        DBFactory oracleFactory=new ORACLEFactory();
        DBFactory mssqlFactory=new MSSQLFactory();

        DB mysql=mysqlFactory.createDB();
        DB mssql=mssqlFactory.createDB();
        DB oracle=oracleFactory.createDB();

        mysql.selectData();
        mysql.insertData();

        oracle.selectData();
        oracle.insertData();

        mssql.selectData();
        mssql.insertData();
    }
}
