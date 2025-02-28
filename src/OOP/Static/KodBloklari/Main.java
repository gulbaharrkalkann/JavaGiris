package OOP.Static.KodBloklari;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı");
       User u1=new User("Gül Kalkan");
       User u2=new User("Seyithan Bozkurt");

        System.out.println("Counter son değer : "+User.counter);
        System.out.println("Program bitti");
    }
}
