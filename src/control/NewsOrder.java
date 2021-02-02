package control;

import java.util.List;
import model.Film;

public class NewsOrder implements Command{
    
    private final List<Film> films;
    
    public NewsOrder(List<Film> films) {
        this.films = films;
    }
    
    @Override
    public void execute() {
    }

}
