package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieTitle;
    private int releaseYear;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String movieTitle, int releaseYear) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int numOfActorsInTwenties = 0;
        int actualAge;
        for (Actor actorSelected: actors) {
            actualAge = releaseYear - actorSelected.getActorYoB();
            if(actualAge > 19 && actualAge < 30) {
                numOfActorsInTwenties++;
            }
        }
        return numOfActorsInTwenties;
    }
}