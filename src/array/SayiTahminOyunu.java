package array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
Random rand=new Random();
int number= rand.nextInt(100);

Scanner scanner=new Scanner(System.in);
int right=0;
int selected;
int[] wrong=new int[5];
boolean isWin=false;
boolean isWrong=false;
        System.out.println(number);
while (right<5){
    System.out.println("lütfen tahmininizi giriniz : ");
    selected= scanner.nextInt();
    if (selected<0||selected>99){
        System.out.println("lütfen 0 ile 100 arasında bir değer giriniz.");
        if (isWrong){
            right++;
            System.out.println("çok fazla hatalı giriş yaptınız Kalan hak : " +(5-right));

        }else {
            isWrong = true;
            System.out.println("bir daha hatalı girişinizde can hakkınızdan düşülecektir");
        }
        continue;
    }
    if (selected==number){
        System.out.println("Tebrikler doğru tahmin! Tahmin ettiğin sayi : "+number);
    isWin=true;

        break;
    }else {

        System.out.println("hatalı bir sayi girdiniz.");
        if (selected>number){
            System.out.println(selected+" sayisi,gizli sayidan büyüktür");
        }else {
            System.out.println(selected+" sayisi,gizli sayidan küçüktür");
        }

        wrong[right++]=selected;

        System.out.println("Kalan hakkınız : "+(5-right));
    }



}
if (!isWin){
    System.out.println("Kaybettiniz");
if (!isWrong){
    System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
}
}


    }
}
