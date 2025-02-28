package DesignPattern.Bridge.Pratik5;
/*
Örnek Senaryo
Bir Çizim Aracı düşünelim:

Farklı Şekiller (ör. Daire, Dikdörtgen) var.
Farklı Çizim Araçları (ör. Vektör, Raster) ile çiziliyor.
 */
public class Main {
    public static void main(String[] args) {
// Vektör çizim API'si ile bir daire
        Shape circle1 = new Circle(5, 10, 15, new VectorDrawingAPI());
        circle1.draw();
        circle1.resize(2);
        circle1.draw();

        System.out.println();

        // Raster çizim API'si ile bir dikdörtgen
        Shape rectangle1 = new Rectangle(2, 4, 8, 16, new RasterDrawingAPı());
        rectangle1.draw();
        rectangle1.resize(1.5);
        rectangle1.draw();
    }
}
