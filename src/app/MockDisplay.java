package app;

import model.Film;
import view.Display;

public class MockDisplay implements Display{
    
    private Film film;
    
    @Override
    public void display(Film film) {
        this.film = film;
        System.out.println(film.title);
    }
}
