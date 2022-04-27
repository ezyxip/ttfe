
package ttfegame;

import javax.swing.JFrame;


public class GameMenu extends GraphicOperator {

    public GameMenu(JFrame jf) {
        super(jf);
    }

    @Override
    public void setActive() {
        jf.removeAll();
        jf.repaint();
        
    }
    
}
