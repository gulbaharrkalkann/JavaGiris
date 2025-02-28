package OOP.Interface.Pratik3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("Tutar giriniz : ");
        double price= scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kart no giriniz : ");
        String cardNumber=scanner.nextLine();
        System.out.print("Son kullanma tarihini giriniz : ");
        String date=scanner.nextLine();
        System.out.print("Güvenlik kodu giriniz : ");
        String cvc=scanner.nextLine();

        System.out.println("1- A Bankası");
        System.out.println("2- B Bankası");
        System.out.println("3- C Bankası");
        System.out.println(" Banka seçiniz : ");
        int selectBank= scanner.nextInt();


        switch (selectBank){
            case 1:
                ABankasi aPos=new ABankasi("A bankası","12345667","123456");
                aPos.connect("127.00.96.55");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2:
                BBankasi bPos=new BBankasi("A bankası","12345667","123456");
                bPos.connect("asdasd");
                bPos.payment(1000,"12345","123","2324");
                break;
        }
    }
}
