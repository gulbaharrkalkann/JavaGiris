package DesignPattern.Adapter.Pratik3;

public class Main {
    public static void main(String[] args) {

        Voice voice=new VoiceMessage();
        voice.shareMessage(voice.voiceMessage());

        Text text=new TextMessage();
        text.ShareMessage(text.textMessage());
        Text adapter=new Adapter(voice);
        adapter.ShareMessage(adapter.textMessage());
    }
}
