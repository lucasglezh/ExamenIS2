package control;

import java.util.List;
import model.Film;

public class LikesOrder implements Command{
    
    private final List<Film> films;
    
    public LikesOrder(List<Film> films) {
        this.films = films;
    }
    
    @Override
    public void execute() {
    }

}
