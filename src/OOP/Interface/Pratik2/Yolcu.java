package OOP.Interface.Pratik2;

import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari {


    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli kaçtır :");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasağınız bulunuyor mu ?");
        String cevap=scanner.nextLine();
        if (cevap.equals("Evet")){
            this.siyasiYasak=true;
        }else {
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu ?");
        String cevap2=scanner.nextLine();
        if (cevap2.equals("Evet")){
            this.vizeDurumu=true;
        }else {
            this.vizeDurumu=false;
        }
    }



    @Override
    public boolean vizeDurumuKontrol() {
      if (this.vizeDurumu==true){
          System.out.println("Vize işlemleri tamam");
          return true;
      }else {
          System.out.println("Vizeniz Gideceğiniz Ülkeye bulunmamaktadır");
          return false;
      }
    }

    @Override
    public boolean yurtdisiHarci() {
        if (this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
            return false;
        }else {
            System.out.println("Yurtdışı harcı işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
     if ( this.siyasiYasak==true){
         System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız");
     return false;
     }else {
         System.out.println("Siyasi yasağınız bulunmuyor");
     return true;
     }

    }
}
