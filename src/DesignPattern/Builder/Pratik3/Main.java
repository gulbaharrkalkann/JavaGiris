package DesignPattern.Builder.Pratik3;

public class Main {
    public static void main(String[] args) {
        Starbucks starbucks = new Starbucks.StarbucksBuilder("tall")
                .setLaktozsuzSutMiktari("Laktozsuz")
                .setYumusatici("Yumuşak").build();
    }
}


