package OOP.Composition;

public class Monitor {
    private String model;
    public String uretici;
    private  String boyut;
    private Resolution resolution;

public Monitor(String model,String uretici,String boyut,Resolution resolution){
    this.model=model;
    this.uretici=uretici;
    this.boyut=boyut;
    this.resolution=resolution;
}
public void monitoruKapat(){
    System.out.println("Monitor kapatılıyor.");
}

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
}
