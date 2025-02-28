package DesignPattern.Bridge.Pratik5;
//Abstraction sınıfı
public  abstract class Shape {

protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();
    public abstract void resize(double factor);
}
