package DesignPattern.Factory.Pratik3;

public class ChicagoStyleVeggiePizza extends Pizza{
 public ChicagoStyleVeggiePizza(){
     name="Chicago Style Pepperoni Pizza";
     dough="Extra thick Crust Dough";
     sauce="Plum Tomato Sauce";

     toppings.add("Shredded Mozzarella Cheese");
     toppings.add("BlackOlives");
     toppings.add("Spinach");
     toppings.add("EggPlant");
     toppings.add("Sliced Pepperoni");
 }


void cut(){
    System.out.println("Cutting the pizza into square slices");
}
}
