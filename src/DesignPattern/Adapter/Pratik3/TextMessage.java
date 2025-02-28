package DesignPattern.Adapter.Pratik3;

public class TextMessage implements Text{

    @Override
    public String textMessage() {
        return "Text Message";
    }

    @Override
    public void ShareMessage(String data) {
        System.out.println(data+" olarak paylaşıldı");
    }
}
