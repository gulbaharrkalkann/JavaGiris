package array.ArrayList;

import java.util.ArrayList;

public class Main {
    public static  void yazdir(ArrayList<String>a){
        for (int i=0;i<a.size();i++){
            System.out.println("element " + +(i+1)+ ":"+a.get(i));
        }

    }
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<String>();

        arrayList.add("Metallica");
        arrayList.add("gums and roses");
        arrayList.add("iron maiden");
        arrayList.add("black sabbath");
arrayList.remove("Metallica");//bi ögeyi array listten silme işlemi . index numrasını yazarak da bu işlemi gerçekleştirebilirsin

arrayList.set(1,"mega death");//index i güncelledik
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());//array list in boyutunu bulduk
        System.out.println(arrayList.indexOf("gums and roses"));//array listteki elemanın indeksini öğrenmek
        for (int i=0;i<arrayList.size();i++){//array i ekrana bastırdık
            System.out.println(arrayList.get(i));


        }
        yazdir(arrayList);
    }
}
