package control;

import java.util.List;
import model.Film;

public class ViewsOrder implements Command{
    
    private final List<Film> films;
    
    public ViewsOrder(List<Film> films) {
        this.films = films;
    }
    
    @Override
    public void execute() {
    }

}
