package DesignPattern.Adapter.Pratik1;

public class Main {
    public static void main(String[] args) {
MssqlAdapter adapter=new MssqlAdapter();
Service service=new Service(adapter);

service.addUser(new User("Kullanıcı 1"));
service.addUser(new User("Kullanıcı 2"));
service.addUser(new User("Kullanıcı 3"));
User user=service.getUser(1);
        User user2=service.getUser(2);
        User user3=service.getUser(3);
        System.out.println(user.getName());
        System.out.println(user2.getName());
        System.out.println(user3.getName());


    }
}
