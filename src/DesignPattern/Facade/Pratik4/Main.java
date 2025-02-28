package DesignPattern.Facade.Pratik4;
/*
Örnek Senaryo
Bir Ev Sinema Sistemi düşünün. Sistemde:

DVD oynatıcı,
Projektör,
Ses sistemi gibi bileşenler var.
 */
public class Main {
    public static void main(String[] args) {

        //Alt sistem nesnelerini oluştur
        DVDPlayer dvdPlayer=new DVDPlayer();
        Projector projector=new Projector();
        SoundSystem soundSystem=new SoundSystem();

        //Facade sınıfını oluştur
        HomeTeatherFacade homeTeather=new HomeTeatherFacade(dvdPlayer,projector,soundSystem);

        homeTeather.watchMovie("Inception");
        homeTeather.endMovie();
    }
}
