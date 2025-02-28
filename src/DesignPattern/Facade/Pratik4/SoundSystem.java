package DesignPattern.Facade.Pratik4;

public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }

    public void setSurroundSound() {
        System.out.println("Sound System is set to Surround Sound");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }
}
