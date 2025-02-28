package DesignPattern.Factory.Pratik1;

public class DBFactory {
    public static  final int   MySql=1;
    public static  final int   MsSql=2;
    public static  final int   Oracle=3;

    public DB getDB(int type){
        if (type==MySql){
            return new MySql();
        } else if (type==Oracle) {
            return new Oracle();
        } else if (type==MsSql) {
            return new MsSql();
        }else return null;
    }
}
