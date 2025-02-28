package DesignPattern.Visitor.Pratik1;
//Elemenet arayüzü her bir öge için bir accept metodu bulundurur.Bu metod gelen ziyaretçiyi kabul eder.
public interface Element {
    void accept(Visitor visitor);//accept:Ziyaretçiyi alır ve onun doğru visit metodunu çağırmasını sağlar.
}
