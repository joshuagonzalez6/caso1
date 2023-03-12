/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

import java.util.ArrayList;

/**
 *
 * @author joshu
 */
public class peliculas {
    
    
    public class Movie {
    private String title;
    private String description;
    private String genre;
    private int rating;

    
    
    public Movie(String title, String description, String genre, int rating) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters and setters for each attribute

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }


}
