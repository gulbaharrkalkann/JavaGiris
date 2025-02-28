package DesignPattern.ChainOfResponsibility.Pratik1;

public enum EnumIl {
    Istanbul("İstanbul"),
    Ankara("Ankara"),
    Antalya("Antalya"),
    Cankiri("Çankırı"),
    Kars("Kars");

    public String il;

    EnumIl(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return il;
    }
}
