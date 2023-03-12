package pelicula;

public class entidadPelicula {
    
   
    public class Pelicula {
    private Long id;
    private String titulo;
    private String director;
    private int año;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }
    
    }
    

}
