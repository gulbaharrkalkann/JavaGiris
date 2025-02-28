package DesignPattern.Composite.Pratik3;
/*
bir Dosya Sistemi senaryosu yazalım. Bu senaryoda:

Component: Dosya ve klasörler için ortak bir arayüzdür.
Leaf: Tek bir dosyayı temsil eder.
Composite: Bir klasörü temsil eder, içinde hem dosyalar hem de alt klasörler bulunabilir.
 */
public class Main {
    public static void main(String[] args) {

        //Dosyaları Oluştur
        File file1=new File("Document1.txt");
        File file2=new File("Photo1.jpg");
        File file3=new File("Presentation.ppt");

        //Klasörleri oluştur
        Folder folder1=new Folder("My Documents");
        Folder folder2=new Folder("Photos");

        //Klasörlere dosyaları ekle
        folder1.addComponent(file1);
        folder2.addComponent(file3);
        folder2.addComponent(file2);

        //Ana klasör oluştur ve alt klasörleri ekle
        Folder rootFolder=new Folder("Root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        //Dosya sistemi detaylarını göster
        rootFolder.showDetails();

    }
}
