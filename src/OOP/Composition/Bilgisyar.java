package OOP.Composition;

public class Bilgisyar {
    private Monitor monitor;
    private Kasa kasa;
    private Anakart anakart;

    public Bilgisyar(Monitor monitor,Kasa kasa,Anakart anakart){
        this.monitor=monitor;
        this.kasa=kasa;
        this.anakart=anakart;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
