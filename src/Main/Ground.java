package Main;

import javafx.scene.control.Cell;

/**
 * Created by ���� on 09.07.2016.
 */
public class Ground {

    private GroundCell[][] landscape;
    private int length, width;

    public Ground(int length, int width){
        landscape = new GroundCell[length][width];
        this.length = length;
        this.width = width;

    }

    public GroundCell[][] getLandscape() {
        return landscape;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
