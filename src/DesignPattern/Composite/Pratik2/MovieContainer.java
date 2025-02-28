package DesignPattern.Composite.Pratik2;

import java.util.ArrayList;
import java.util.List;

public class MovieContainer implements Movie{

    private List<Movie> movies=new ArrayList<>();
    @Override
    public void showMovieInfo() {
        for (Movie movie: movies){
            movie.showMovieInfo();
        }
    }
    public void addMovie(Movie movie){
        movies.add(movie);
    }
    public void removeMovies(Movie movie){
        movies.remove(movie);
    }
}
