package DesignPattern.Bridge.Pratik3;

public class Bilgisayar {
    private Spotify spotify;
    private Hoparlor hoparlor;

    public Bilgisayar(){
        spotify=new Spotify();
        hoparlor=new Hoparlor();

    }
    public void muzikCal(Muzik muzik){
        System.out.println("Bilgisyar çalıştı.");
      String ses=  spotify.muzikCal(muzik);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlor getHoparlor() {
        return hoparlor;
    }

    public void setHoparlor(Hoparlor hoparlor) {
        this.hoparlor = hoparlor;
    }
}
