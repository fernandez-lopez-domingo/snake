
import java.awt.Color;

/**
 * Player esta es la clase Player
 * @version v1.0
 * @author Domingo Fernandez Lopez
 */
public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    /**
     * 
     * @param no int
     */
    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    /**
     * 
     * @return int
     */
    public int getPosition() {
        return playerPosn;
    }

    /**
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param posn int
     */
    public void setPosition(int posn) {
        playerPosn = posn;
    }

    /**
     * 
     * @param posn int
     */
    public void incPosition(int posn) {
        playerPosn += posn;
    }

    /**
     * 
     * @param c Color
     */
    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    /**
     * 
     * @return Color
     */
    public Color getPlayerColor() {
        return playerColor;
    }

    /**
     * 
     * @param a int
     */
    public void incPlayerScore(int a) {
        playerScore += a;
    }

    /**
     * 
     * @return int
     */
    public int getPlayerScore() {
        return playerScore;
    }

}
