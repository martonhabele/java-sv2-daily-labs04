package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Event Horizon", 1996);

        movie.addActor(new Actor("John Who", 1977));
        movie.addActor(new Actor("John WhoAgain", 1971));

        System.out.println(movie.actorsInTheirTwenties());
    }
}