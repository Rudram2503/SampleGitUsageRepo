package pojo;

public class Addmovie {
    private String movieId;
    private String movieTitle;
    private int durationInMins;
    private String language;
    private String genre;
    private String releaseDate;
    private String country;

    // ✅ Constructor
    public Addmovie(String movieId, String movieTitle, int durationInMins,
                 String language, String genre, String releaseDate, String country) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.durationInMins = durationInMins;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.country = country;
    }

    // ✅ Getters & Setters
    public String getMovieId() { return movieId; }
    public void setMovieId(String movieId) { this.movieId = movieId; }

    public String getMovieTitle() { return movieTitle; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }

    public int getDurationInMins() { return durationInMins; }
    public void setDurationInMins(int durationInMins) { this.durationInMins = durationInMins; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
