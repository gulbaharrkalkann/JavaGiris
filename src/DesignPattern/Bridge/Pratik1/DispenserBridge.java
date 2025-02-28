package DesignPattern.Bridge.Pratik1;

public class DispenserBridge {
    private final ICarboy carboy;
    private final IDispenser dispenser;

    public DispenserBridge(ICarboy carboy,IDispenser dispenser) {
        this.carboy=carboy;
        this.dispenser=dispenser;
    }
    public Water hot(){
        Water water=carboy.flow();
        return dispenser.hot(water);
    }
    public Water cold(){
        Water water=carboy.flow();
        return dispenser.cold(water);
    }
    public Water normal(){
        Water water=carboy.flow();
        return dispenser.normal(water);
    }
}
