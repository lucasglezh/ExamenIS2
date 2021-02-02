package model;

public class Film {
    
    private final String director;
    private final String genre;
    public String title;
    private final int year;
    private final double likePercentage;
    private final int views;
    
    public Film(String title, String director, String genre, int year, double likePercentage, int views) {
        this.director = director;
        this.genre = genre;
        this.title = title;
        this.year = year;
        this.likePercentage = likePercentage;
        this.views = views;
    }

    public String getInformation() {
        return title + " " + year + " " + genre + " " + director + " " + views + " " + likePercentage;
    }
    
    
    
}
