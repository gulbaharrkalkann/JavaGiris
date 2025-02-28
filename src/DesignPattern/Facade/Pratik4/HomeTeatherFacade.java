package DesignPattern.Facade.Pratik4;

public class HomeTeatherFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTeatherFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }
    //Film izleme işlemini başlatan metod
    public void watchMovie(String movie){
        System.out.println("\nGet ready to watch a movie...");
        projector.on();
        projector.setWideScreenMode();
        soundSystem.on();
        soundSystem.setSurroundSound();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        //Film izlemeyi bitiren mod


    }
    public void endMovie(){
        System.out.println("\nShutting down the home theater");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        System.out.println("Home theater is off.Goodbye. ");
    }
}
