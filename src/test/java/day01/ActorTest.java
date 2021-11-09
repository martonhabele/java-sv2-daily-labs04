package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    @Test
    public void createActor() {
        Actor actor =new Actor("John Doe", 1973);

        assertEquals("John Doe", actor.getActorName());
        assertEquals(1973, actor.getActorYoB());
    }
}