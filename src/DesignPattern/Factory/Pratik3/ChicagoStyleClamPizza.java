package DesignPattern.Factory.Pratik3;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name="Chicago Style Clam Pizza";
        dough="Extra thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

