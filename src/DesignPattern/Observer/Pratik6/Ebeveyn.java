package DesignPattern.Observer.Pratik6;

public class Ebeveyn implements Observer{

    private String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observerable observerable) {
Termometre termometre=(Termometre) observerable;
        System.out.println(adi + " dedi ki: ooo sicaklık " + termometre.getAnlikSicaklil()+
                " derece olmuş!");
    }
}
