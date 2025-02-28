package OOP.Static.KodBloklari;

public class User {
    public String name;
    public static int counter;

    static {
        System.out.println("2. Static Kod Bloğuu");
        int random=(int)(Math.random()*100);
        System.out.println("3.Random Sayı : "+random);
        counter=random;
        System.out.println("4. Counter varsayılan değer");
    }

    public User(String name){
        this.name=name;
        counter++;
        System.out.println("Counter Yeni Değer : "+counter);
    }
}
