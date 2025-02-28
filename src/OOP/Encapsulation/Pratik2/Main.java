package OOP.Encapsulation.Pratik2;

public class Main {
    public static void main(String[] args) {
        Book harryPotter=new Book("Hary Potter",150);
        Book lordOfRings=new Book("Lord of Rings",-150);


        lordOfRings.setName("abc");
        System.out.println(lordOfRings.getName());


    }
}
