package Main;

/**
 * Created by Алёна on 09.07.2016.
 */
public class Rover implements Turnable, Moveable{

    private int x, y;
    private Direction direction;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x = " + x + "; y = " + y);
    }

    @Override
    public void turnTo(Direction direction) {
        this.direction = direction;
        System.out.println("Direction: " + direction);
    }
}
