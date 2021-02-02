package control;

import java.util.List;
import model.Film;

public class GenreOrder implements Command{
    
    private final List<Film> films;
    
    public GenreOrder(List<Film> films) {
        this.films = films;
    }

    @Override
    public void execute() {

    }
    
}
