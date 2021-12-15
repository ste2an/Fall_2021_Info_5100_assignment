package finalExam.q4;

import java.util.Date;
import java.util.List;

public class Movie {

    private String title;
    private Date releaseDate;
    private List<String> actor;

    private List<String> director;

    public Movie(String title, Date releaseDate, List<String> actor, List<String> director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.actor = actor;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String classical) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getActor() {
        return actor;
    }

    public void setActor(List<String> actor) {
        this.actor = actor;
    }

    public List<String> getDirector() {
        return director;
    }

    public void setDirector(List<String> director) {
        this.director = director;
    }

}
