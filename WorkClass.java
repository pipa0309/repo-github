package HomeTaskOne;

public class WorkClass {
    public static void main(String[] args) {

        Barrier track = new Track();
        Barrier wall = new Wall();

        Participant human = new Human();
        Participant cat = new Cat();
        Participant robot = new Robot();

        track.interaction(human);
        track.interaction(cat);
        track.interaction(robot);
        System.out.println();
        wall.interaction(human);
        wall.interaction(cat);
        wall.interaction(robot);




    }
}
