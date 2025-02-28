package DesignPattern.ChainOfResponsibility.Pratik1;

public class Main {
    public static void main(String[] args) {

        KargoSirketi sbmKargo=SbmKargo.getKargoSirketi();
        sbmKargo.kargola(EnumIl.Kars);

        System.out.println("\n--------\n");
sbmKargo.kargola(EnumIl.Kars);
        System.out.println("\n--------\n");
sbmKargo.kargola(EnumIl.Antalya);
        System.out.println("\n--------\n");
sbmKargo.kargola(EnumIl.Istanbul);
        System.out.println("\n--------\n");
        sbmKargo.kargola(EnumIl.Ankara);
    }
}
