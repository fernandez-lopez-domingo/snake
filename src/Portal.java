
import java.awt.Point;
import java.util.Random;

/**
 * Portal esta es la clase Portal
 * @version v1.0
 * @author Domingo Fernandez Lopez
 */
public class Portal {

    private int nature; //-1 for snake , +1 for ladder
    private int start;
    private int end;

    /**
     * 
     * @param maxCells int
     */
    public Portal(int maxCells) {   //creates random portals
        Random luck = new Random();
        start = luck.nextInt(maxCells);
        end = luck.nextInt(maxCells);
        if (start < end) {
            nature = 1;
        } else {
            nature = -1;
        }
    }

    /**
     * 
     * @return int
     */
    public int returnNature() {
        return nature;
    }

    /**
     * 
     * @return int
     */
    public int returnStart() {
        return start;
    }

    /**
     * 
     * @return int
     */
    public int returnEnd() {
        return end;
    }

}
