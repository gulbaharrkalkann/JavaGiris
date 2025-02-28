package DesignPattern.Composite.Pratik6;
/*
örnek olarak Restoran Menü Sistemi senaryosunu ele alabiliriz. Bu sistemde:

Component: Menü öğesi için ortak bir arayüzdür (örneğin, yemekler ve içecekler).
Leaf: Tek bir yemek veya içeceği temsil eder.
Composite: Alt menüleri veya menü gruplarını (örneğin, "Tatlılar", "İçecekler") temsil eder.
 */
public class Main {
    public static void main(String[] args) {

        //Menü ögelerini oluştur
        MenuItem burger=new MenuItem("Burger",5.99);
        MenuItem fries=new MenuItem("Fries",2.99);
        MenuItem soda=new MenuItem("Soda",1.99);
        MenuItem iceCream=new MenuItem("İce Cream",3.49);
        MenuItem coffee=new MenuItem("Coffee",2.49);

        //Menü gruplarını oluştur

        MenuGroup mainMenu=new MenuGroup("Main Menu");
        MenuGroup lunchMenu=new MenuGroup("Lunch Menu");
        MenuGroup dessertMenu=new MenuGroup("Dessert Menu");

        //Alt Menüleri oluştur
        lunchMenu.addMenuComponent(burger);
        lunchMenu.addMenuComponent(fries);
        lunchMenu.addMenuComponent(soda);

        dessertMenu.addMenuComponent(iceCream);
        dessertMenu.addMenuComponent(coffee);

        //Ana menüye alt menüleri ekle
        mainMenu.addMenuComponent(lunchMenu);
        mainMenu.addMenuComponent(dessertMenu);
        mainMenu.showDetails();
        System.out.println("Total Price : "+mainMenu.getPrice()+" $");

    }
}
