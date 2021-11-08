package day01;

public class Actor {
    private String actorName;
    private int actorYoB;

    public Actor(String actorName, int actorYoB) {
        this.actorName = actorName;
        this.actorYoB = actorYoB;
    }

    public String getActorName() {
        return actorName;
    }

    public int getActorYoB() {
        return actorYoB;
    }
}