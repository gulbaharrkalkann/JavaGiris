package DesignPattern.Adapter.Pratik3;

public class VoiceMessage implements Voice{

    @Override
    public String voiceMessage() {
        return "Voice Message";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data+" paylaşıldı.");
    }
}
