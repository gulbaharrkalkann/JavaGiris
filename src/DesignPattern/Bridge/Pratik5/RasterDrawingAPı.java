package DesignPattern.Bridge.Pratik5;

public class RasterDrawingAPı implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Vector Circle : Center ( "+x+", "+y+"),Radius : "+radius);
    }

    @Override
    public void drawRectangle(double x, double y, double widht, double height) {
        System.out.println("Vector Rectagle : Top-Left ( "+x+" ,"+y+" ), Widht : "+widht+" ,Height"+height);
    }
}
