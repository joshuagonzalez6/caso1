
package pelicula;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pelicula.entidadPelicula.Pelicula;
import pelicula.interfazdelservicio.PeliculaService;

public class servicio {
    
    @Service
public class PeliculaServiceImpl implements PeliculaService {
    private List<Pelicula> peliculas = new ArrayList<>();
    private Long id = 1L;

    @Override
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }

    @Override
    public Pelicula obtenerPeliculaPorId(Long id) {
        return peliculas.stream()
                .filter(pelicula -> pelicula.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No se encontró la película con id " + id));
    }

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        pelicula.setId(id++);
        peliculas.add(pelicula);
        return pelicula;
    }

    @Override
    public void eliminarPelicula(Long id) {
        peliculas.removeIf(pelicula -> pelicula.getId().equals(id));
    }
}
}
