package OOP.Interface.Pratik1;

public class Main {
    public static void main(String[] args) {

       // PcMuhendis muhendis1=new PcMuhendis(false,false);
        /*
IMuhendis muhendis1=new PcMuhendis(false,false);
        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilSorgula();
        System.out.println(muhendis1.mezuniyetOrtalaması(3.07));
        String[] tecrube={"Vestel","Havelsan","Turksat"};
        muhendis1.isTecrübesi(tecrube);
         */

        MakineMuhendisi muhendis1=new MakineMuhendisi(false,false);
String[] tecrube={};
String[] referans={"gül kalkan","seyithan bozkurt"};
muhendis1.adliSicilSorgula();
muhendis1.askerlikDurumuSorgula();
        System.out.println(muhendis1.mezuniyetOrtalaması(2.31));
        muhendis1.isTecrübesi(tecrube);
        muhendis1.referansGetir(referans);
        muhendis1.calis();
    }
}
