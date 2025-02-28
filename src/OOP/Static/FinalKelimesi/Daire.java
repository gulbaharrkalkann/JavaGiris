package OOP.Static.FinalKelimesi;

public class Daire {
    public int r;
    public final double  pi=3.14;
    public Daire(int r){
        this.r=r;
    }
    public void calcArea(){
        double area=pi*this.r*this.r;
        System.out.println("Dairenin Alanı : "+area);
    }
}
