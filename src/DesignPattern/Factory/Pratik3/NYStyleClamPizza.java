package DesignPattern.Factory.Pratik3;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name="NY Style Clam Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
    }

