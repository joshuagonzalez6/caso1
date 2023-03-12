package pelicula;

import java.util.List;
import pelicula.entidadPelicula.Pelicula;


public class interfazdelservicio {
    
    public interface PeliculaService {
    List<Pelicula> obtenerPeliculas();
    Pelicula obtenerPeliculaPorId(Long id);
    Pelicula crearPelicula(Pelicula pelicula);
    void eliminarPelicula(Long id);
}
}
