package OOP.Beyblade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q'ya basınız");
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("Hangi Beyblade yi üretmek istiyorsunuz");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor");
                break;
            }else {
                BeybladeFabrikası fabrika=new BeybladeFabrikası();
                Beyblade beyblade=fabrika.beybladeUret(islem);
            if (beyblade==null){
                System.out.println("Lütfen geçerli bir beyblade giriniz");
            }else {
                beyblade.bilgileriGoster();
                beyblade.saldir();
                beyblade.kutsalCanavarOrtayaCikar();
            }

            }
        }



    }
}
