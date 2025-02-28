package DesignPattern.Adapter.Pratik2;

public class Main {
    public static void main(String[] args) {

        Priz priz=new Priz();
        Utu utu=new Utu();
        Buzdolabi buzdolabi=new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);
        Samsung samsung=new Samsung();
        TelefonEEAAdapter adapter=new TelefonEEAAdapter(samsung);
        priz.elektrikVer(adapter);
    }
}
