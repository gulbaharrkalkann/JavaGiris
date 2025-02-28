package array;

import java.util.Scanner;

public class array {
//kullanıcıdan aldığımız değerlerle matris oluşturma
    public static void main(String[] args) {
int [][] array2=new int[2][2];
        Scanner scanner=new Scanner(System.in);
        System.out.println("matris değerlerini giriniz.");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
               array2[i][j]=scanner.nextInt();
            }
        }
        System.out.println("********************");
        System.out.println("oluşan matris");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){

                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
