package DesignPattern.Bridge.Pratik3;

public class Muzik {
    private String ad;
    private String ses;

    public Muzik(String ad, String ses) {
        this.ad = ad;
        this.ses = ses;
    }

    public String toString(){
        return ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }
}
