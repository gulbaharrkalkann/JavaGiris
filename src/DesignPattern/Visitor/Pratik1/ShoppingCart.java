package DesignPattern.Visitor.Pratik1;

import java.util.ArrayList;
import java.util.List;
//Bu sınıf ürünleri bir koleksiyonda tutacak ve ziyaretçiyi bu ürünlere yönlendirecek
public class ShoppingCart {
    private List<Element> items;

    public ShoppingCart(){
        items=new ArrayList<>();
    }
    public void addItem(Element item){
        items.add(item);
    }
    public void accept(Visitor visitor){
        for (Element item :items){
            item.accept(visitor);//Her bir öğeye ziyaretçiyi yönlendirir
        }
    }
}
