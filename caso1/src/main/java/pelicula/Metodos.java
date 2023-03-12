
package pelicula;

import java.util.ArrayList;
import pelicula.peliculas.Movie;

/**
 *
 * @author joshu
 */
public class Metodos {
    
    ArrayList<peliculas.Movie> movieList = new ArrayList<>();

public void addMovie(Movie movie) {
    movieList.add(movie);
}
    
    public void deleteMovie(int index) {
    movieList.remove(index);
}
    
    public void displayMovies() {
    for (Movie movie : movieList) {
        System.out.println(movie.getTitle());
        System.out.println(movie.getDescription());
        System.out.println(movie.getGenre());
        System.out.println(movie.getRating());
    }
}
    
   movieList.deleteMovie(0); 
    
    
public void displayMovies() {
        Iterable<peliculas.Movie> movieList = null;
    for (peliculas.Movie movie : movieList) {
        System.out.println(movie.getTitle());
        System.out.println(movie.getDescription());
        System.out.println(movie.getGenre());
        System.out.println(movie.getRating());
    }
    
}

}
