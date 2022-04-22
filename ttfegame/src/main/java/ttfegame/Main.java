
package ttfegame;

import ttfegame.logical.TTFEGraphic;
import ttfegame.logical.SaveManager;
import javax.swing.JFrame;

public class Main {
    public static void main (String[] args){
        JFrame window = new JFrame("TTFE Game");
        SaveManager sm = new SimpleSaveManager();
        TTFEGraphic grafic = new TTFETestGraphic(window);
        //GameManager gm = new GameManager(grafic, sm);
        //gm.start();
    }
}
