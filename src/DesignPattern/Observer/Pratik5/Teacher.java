package DesignPattern.Observer.Pratik5;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ISubject{

    private boolean isExplaining=false;

    public boolean getIsExplaining() {
        return isExplaining;
    }

    private List<IObserver>observers=new ArrayList<IObserver>();
    @Override
    public void subscribe() {
for (IObserver observer:observers){
    observer.handle(this);
}
    }

    @Override
    public void addObserver(IObserver observer) {
observers.add(observer);
    }
    public void enterClass(){
        isExplaining=true;
        subscribe();
    }
    public void quitClass(){
        isExplaining=false;
        subscribe();
    }

}
