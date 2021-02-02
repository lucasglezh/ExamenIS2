package control;

import java.util.List;
import java.util.Scanner;
import model.Film;

public class SelectCommand implements Command{
    
    private final List<Film> films;
    private String search;
    
    public SelectCommand(List<Film> films) {
        this.films = films;
    }

    @Override
    public void execute() {
        int i = 0;
        System.out.println("Inserte el título de la película que desee seleccionar:");
        Scanner scanner = new Scanner(System.in);
        search = scanner.nextLine();
        for (Film film : films) {
            if(search.equals(film.title)){
                i = 1;
                System.out.println(film.getInformation());
            }
        }
        if(i==0){
            System.out.println("Esta película no se encuentra en el catálogo");
        }
    }

}
