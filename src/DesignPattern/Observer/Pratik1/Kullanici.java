package DesignPattern.Observer.Pratik1;

public class Kullanici implements Observer{

    private Observable observable;


    public void remove(){
        observable.removeObserver(this);
    }
    public void set(Observable observable){
        this.observable=observable;
    }


    @Override
    public void notify(String mesaj) {
        System.out.println(mesaj+" !!!");
    }
}
