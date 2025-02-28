package array;

public class ForEach {
    public static void main(String[] args) {

        String[] array={"elma","armut","kiraz"};
        int[] array2={1,2,3,4,5,6};
        Deneme[] array3={new Deneme("gül"),new Deneme("bahar"),new Deneme("kalkan")};
        for (Deneme d:array3){
           d.yaz();
        }
        for (int i:array2){
            System.out.println(i);
        }
        for (String a:array){
            System.out.println(a);
        }



    }
}
