package OOP.Encapsulation.Pratik1;

public class Main {
    public static void main(String[] args) {
/*
        Abone abone=new Abone();
        abone.isim="Gül";
        abone.bakiye=200;
        abone.sehir="Ankara";

        abone.dogalgazKullan(200);
 */

        GelismisAbone abone=new GelismisAbone("Gül ",200,"Ankara");
        abone.bakiyeOgren();

    }
}
