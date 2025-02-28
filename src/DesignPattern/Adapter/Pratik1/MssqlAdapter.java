package DesignPattern.Adapter.Pratik1;

public class MssqlAdapter implements DB {
    Mssql mssql;
    public MssqlAdapter(){
        mssql=new Mssql();
    }
    @Override
    public User selectUserById(int id){
        return mssql.UserById(id);
    }
    @Override
    public void insertUser(User user){
        mssql.user(user);
    }
}
