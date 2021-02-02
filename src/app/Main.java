package app;

import control.Command;
import control.ExitCommand;
import control.GenreOrder;
import control.LikesOrder;
import control.NewsOrder;
import control.SelectCommand;
import control.ViewsOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Film;
import view.Display;

public class Main{
    
    private List<Film> films;
    private final Display mockDisplay;
    private Map<String, Command> commands = new HashMap<>();
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main(){
        this.mockDisplay = new MockDisplay();
    }

    private void execute(){
        this.films = new ArrayList<Film>();
        films.add(new Film("Anaconda", "Ángel","Acción", 1994, 0.72, 834217));
        films.add(new Film("Benedicto XVI", "Barbara","Drama", 2015, 0.81, 620188));
        films.add(new Film("Cars", "Carlos","Animación", 2006, 0.92, 1219324));
        films.add(new Film("Despues de ti", "Daniel","Romántica", 1999, 0.88, 762142));
        films.add(new Film("Epsilon", "Ester","Ciencia Ficción", 1989, 0.69, 753354));
        films.add(new Film("Fiesta informal", "Fernando","Comedia", 2010, 0.69, 863204));
        Scanner scanner = new Scanner(System.in);
        this.commands = createCommands();
        Command defaultValue = null;
        while(true) {
            commands.getOrDefault(scanner.next(), defaultValue).execute();
        }
    }

    private Map<String, Command> createCommands() {
        this.commands.put("e", new ExitCommand());
        this.commands.put("g", new GenreOrder(films));
        this.commands.put("l", new LikesOrder(films));
        this.commands.put("n", new NewsOrder(films));
        this.commands.put("s", new SelectCommand(films));
        this.commands.put("v", new ViewsOrder(films));  
        this.commands.put("E", commands.get("e"));
        this.commands.put("G", commands.get("g"));
        this.commands.put("L", commands.get("l"));
        this.commands.put("N", commands.get("n"));
        this.commands.put("S", commands.get("s"));
        this.commands.put("V", commands.get("v"));
        return commands;
    }
    
}

