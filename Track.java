package HomeTaskOne;

public class Track implements Barrier {

    public Track() {
    }

    public void interaction(Participant participant) {
        participant.run();
    }

    public boolean flag() {
        return true;
    }
}
