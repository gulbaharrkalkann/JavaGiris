package DesignPattern.Adapter.Pratik3;

public class Adapter implements Text{


     private  String message;
     private Voice voice;

    public Adapter(Voice voice) {
        this.voice = voice;
    }

    @Override
    public String textMessage() {
        return voice.voiceMessage()+" Text metne dönüştürüldü.Text metin ";

    }

    @Override
    public void ShareMessage(String data) {
        System.out.println(data+" olarak paylaşıldı.");

    }
}
