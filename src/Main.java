
import javax.swing.SwingUtilities;

/**
 * Main esta es la clase Main
 * @version v1.0
 * @author Domingo Fernandez Lopez
 */
public class Main {

    /**
     * @param args String[]
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setSize(600, 400);
                mw.setTitle("Snake and Ladder");
                mw.setVisible(true);
            }
        });
    }

}
