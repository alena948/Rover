package Main;

/**
 * Created by Алёна on 09.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Rover r = new Rover();
        r.move(1,1);
        r.turnTo(Direction.EAST);
        /*r.getVisor().setGround(new Ground(10, 10));
        r.moveTo(19, 9);*/
    }
}