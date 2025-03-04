package DesignPattern.Composite.Pratik2;

public class Horror implements Movie{
    private int id;
    private String name;
    private String releaseDate;
    private double imdb;

    public Horror(int id, String name, String releaseDate, double imdb) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.imdb = imdb;
    }

    @Override
    public void showMovieInfo() {
        System.out.println("Film adı : "+name);
        System.out.println("Yayın tarihi : "+releaseDate);
        System.out.println("İmdb : "+imdb);
        System.out.println("--");
    }
}
