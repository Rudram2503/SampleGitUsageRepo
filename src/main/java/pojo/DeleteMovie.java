package pojo;

public class DeleteMovie {
    private String movieId;

    public DeleteMovie(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
