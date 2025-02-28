package OOP.Beyblade;

import java.util.PrimitiveIterator;

public class Beyblade {

    private String beybleydci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybleydci,int donusHizi,int saldiriGucu){
        this.beybleydci=beybleydci;
        this.donusHizi=donusHizi;
        this.saldiriGucu=saldiriGucu;
    }

    public String getBeybleydci() {
        return beybleydci;
    }

    public void setBeybleydci(String beybleydci) {
        this.beybleydci = beybleydci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir(){
        System.out.println(getBeybleydci()+saldiriGucu+" ve "+donusHizi+" ile saldırıyor");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblaydin kutsal canavarı bulunmuyor");
    }
    public void bilgileriGoster(){
        System.out.println("Beybleydci İsmi : "+beybleydci);
        System.out.println("Saldırı Gücü : " +saldiriGucu);
        System.out.println("Dönüş Hızı : "+donusHizi);
    }
}
