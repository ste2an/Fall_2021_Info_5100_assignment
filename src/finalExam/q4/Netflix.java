package finalExam.q4;

import java.util.List;

public class Netflix {
    private List<Genre> genres;

    public Netflix(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
