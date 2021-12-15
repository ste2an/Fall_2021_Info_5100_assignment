package finalExam.q4;

import java.util.List;

public class Genre {
    private List<Movie> movies;

    public Genre(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
