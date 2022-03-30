package HomeTaskOne;

public class Wall implements Barrier {

    public Wall() {
    }

    public void interaction(Participant participant) {
        participant.jump();
    }
}
