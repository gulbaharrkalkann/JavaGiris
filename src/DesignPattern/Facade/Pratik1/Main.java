package DesignPattern.Facade.Pratik1;

interface Sekil{
    public void ciz();
}
class Kare implements Sekil{
    @Override
    public void ciz() {
        System.out.println("Kare cizildi");
    }
}
class Daire implements Sekil{
    @Override
    public void ciz() {
        System.out.println("Daire  cizildi");
    }
}
class Ucgen implements Sekil{
    @Override
    public void ciz() {
        System.out.println("Üçgen cizildi");
    }
}
class SekilOLusturucu{
    private Kare kare;
    private Daire daire;
    private Ucgen ucgen;
public SekilOLusturucu(){
    kare=new Kare();
    daire=new Daire();
    ucgen=new Ucgen();
}
public void kareCiz(){
    kare.ciz();
}
public void daireCiz(){
    daire.ciz();
}
public void ucgenCiz(){
    ucgen.ciz();
}




}


public class Main {
    public static void main(String[] args) {
SekilOLusturucu sekilOLusturucu=new SekilOLusturucu();
sekilOLusturucu.daireCiz();
sekilOLusturucu.kareCiz();
sekilOLusturucu.ucgenCiz();
    }
}
