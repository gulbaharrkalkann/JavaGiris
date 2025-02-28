package DesignPattern.Bridge.Pratik1;

public class Main {
    public static void main(String[] args) {

        DispenserBridge bridge=new DispenserBridge(new Erikli(),new Bosch());
        Water w1= bridge.cold();
        System.out.println(w1.getDegree());
    }
}
