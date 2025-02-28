package OOP.İnheritance.Pratik3;

public class Main {
    public static void main(String[] args) {
//Calisan calisan1=new Calisan("gül kalkan","0541635388283","abcQgmail.com");
      //  calisan1.giris();
      //  Akademisyen a1=new Akademisyen("gül kalkan","98765432","abc@gmail.com","CENG","Doçent");

    //    a1.cikis();
//a1.derseGir();

//Memur m1=new Memur("gül kalkan","1234567","abc@gmail.com","bilgi işlem","09.00-18.00");
//m1.yemekhane();
//m1.calis();
OgretimGorevlisi o1=new OgretimGorevlisi("gül kalkan","123456","abc@gmail.com","CENG","Doçent","1123");
//o1.giris();
//o1.derseGir();
  //      System.out.println(o1.getKapiNo());
      //  Asistan asistan=new Asistan("gül kalkan","987654","abc@gmail.com","Matematik","doçent",9);
  //     asistan.quizYap();
    //    System.out.println(asistan.getOfisSaati());
        //BilgiIslem bilgiIslem=new BilgiIslem("gül kalkan","0987654","abc@gmail.com","BT","14.00-18.00","öğretici");
        //bilgiIslem.networkKurulum();
       // o1.giris("10.00","18.00");
        //("gül kalkan","98765432","abc@gmail.com","CENG","Doçent");
  //  a2.giris();

   // int[] loginUser =new int[5];
  //  Calisan[] loginUser={calisan1,m1,a1,o1};
//Calisan.girisYapanlar(loginUser);
        o1.derseGir("10.00");
        Asistan asistan=new Asistan("gül","1234","abcgmail.com","yazılım","prof",10);
        asistan.derseGir("10.00");

    }
}
