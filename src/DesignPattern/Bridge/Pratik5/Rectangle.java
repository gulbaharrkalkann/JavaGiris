package DesignPattern.Bridge.Pratik5;

public class Rectangle extends Shape{
    private double x,y,widht,height;

    public Rectangle( double x, double y,double widht, double height,DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.widht=widht;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(x,y,widht,height);
    }

    @Override
    public void resize(double factor) {
widht*=factor;
height*=factor;
    }
}
