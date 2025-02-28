package DesignPattern.Composite.Pratik6;

import java.util.ArrayList;
import java.util.List;
//Composite sınıfı:Alt menüleri veya menü gruplarını (tatlılar içecekler)
public class MenuGroup implements MenuComponent{
    private String groupName;
    private List<MenuComponent> menuComponents=new ArrayList<>();

    public MenuGroup(String groupName) {
        this.groupName = groupName;
    }
    public void addMenuComponent(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void removeMenuComponent(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Menu Group : "+groupName);
        for (MenuComponent component:menuComponents){
            component.showDetails();
        }
    }

    @Override
    public double getPrice() {
        double total=0.0;
        for (MenuComponent component:menuComponents){
            total+=component.getPrice();
        }
        return total;
    }
}
